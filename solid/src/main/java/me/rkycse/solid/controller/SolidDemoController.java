package me.rkycse.solid.controller;


import me.rkycse.solid.dip.good.NotificationService;
import me.rkycse.solid.lsp.good.Bird;
import me.rkycse.solid.lsp.good.FlyingBird;
import me.rkycse.solid.lsp.good.Penguin;
import me.rkycse.solid.ocp.good.EmailProvider;
import me.rkycse.solid.ocp.good.SmsProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/solid")
public class SolidDemoController {

    // Demonstrating DIP: We depend on the abstraction (NotificationService)
    // not a concrete implementation. Spring injects the required beans.
    private final NotificationService notificationService;

    @Autowired
    public SolidDemoController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the SOLID Principles Demo! Check the README.md file and explore the other endpoints.";
    }

    /**
     * Demonstrates Single Responsibility Principle (SRP).
     * Check the classes in the com.example.solidprinciples.srp package.
     */
    @GetMapping("/srp")
    public String demoSrp() {
        // Bad Example (see srp.bad.Report)
        // The Report class is responsible for both content generation and saving.
        // This violates SRP because it has two reasons to change.

        // Good Example (see srp.good.*)
        // We separate concerns into two classes.
        me.rkycse.solid.srp.good.ReportGenerator reportGenerator = new me.rkycse.solid.srp.good.ReportGenerator();
        me.rkycse.solid.srp.good.ReportPersistence reportPersistence = new me.rkycse.solid.srp.good.ReportPersistence();

        String reportContent = reportGenerator.generateReport("Financial Data");
        reportPersistence.saveToFile("report.txt", reportContent);

        return "SRP Demo: Report generated and saved using separate classes. Check the console/code for details.";
    }

    /**
     * Demonstrates Open/Closed Principle (OCP).
     * The system is open for extension (adding new providers) but closed for modification.
     */
    @GetMapping("/ocp")
    public String demoOcp() {
        // Bad Example (see ocp.bad.NotificationService)
        // Adding a new notification type would require modifying the sendNotification method.

        // Good Example (see ocp.good.*)
        // We can add new providers without changing the NotificationService.
        me.rkycse.solid.ocp.good.NotificationService service = new me.rkycse.solid.ocp.good.NotificationService();
        String emailResult = service.sendNotification("Hello via Email!", new EmailProvider());
        String smsResult = service.sendNotification("Hello via SMS!", new SmsProvider());

        // Imagine adding a PushProvider. We just create the class; no changes to NotificationService.
        return "OCP Demo: Notifications sent via different providers. " + emailResult + " | " + smsResult;
    }

    /**
     * Demonstrates Liskov Substitution Principle (LSP).
     * Subtypes must be substitutable for their base types.
     */
    @GetMapping("/lsp")
    public String demoLsp() {
        // Bad Example (see lsp.bad.*)
        // A Penguin is a Bird, but it can't fly. If we substitute a Penguin for a Bird
        // and call fly(), it breaks the program's logic.

        // Good Example (see lsp.good.*)
        // We create a more specific abstraction (FlyingBird) for birds that can fly.
        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird()); // A generic bird
        birds.add(new FlyingBird()); // A flying bird
        birds.add(new Penguin()); // A penguin

        StringBuilder result = new StringBuilder("LSP Demo Results: <br>");
        for (Bird bird : birds) {
            // We can call eat() on any bird.
            result.append(bird.eat()).append("<br>");
            // But we only call fly() on birds that are instances of FlyingBird.
            if (bird instanceof FlyingBird) {
                result.append(((FlyingBird) bird).fly()).append("<br>");
            }
        }
        return result.toString();
    }

    /**
     * Demonstrates Interface Segregation Principle (ISP).
     * Clients should not be forced to depend on interfaces they do not use.
     */
    @GetMapping("/isp")
    public String demoIsp() {
        // Bad Example (see isp.bad.MultiFunctionPrinter)
        // A SimplePrinter would be forced to implement scan() and fax(), which it can't do.

        // Good Example (see isp.good.*)
        // We segregate the interface into smaller, more specific ones.
        me.rkycse.solid.isp.good.SimplePrinter simplePrinter = new me.rkycse.solid.isp.good.SimplePrinter();
        me.rkycse.solid.isp.good.Photocopier photocopier = new me.rkycse.solid.isp.good.Photocopier();

        String simpleResult = simplePrinter.print("Document");
        String photoResult1 = photocopier.print("Photo");
        String photoResult2 = photocopier.scan("Photo");

        return "ISP Demo: <br>" + simpleResult + "<br>" + photoResult1 + "<br>" + photoResult2;
    }


    /**
     * Demonstrates Dependency Inversion Principle (DIP).
     * High-level modules should not depend on low-level modules. Both should depend on abstractions.
     */
    @GetMapping("/dip")
    public String demoDip() {
        // Bad Example (see dip.bad.NotificationService)
        // The service directly depends on a concrete EmailSender, making it hard to switch to another sender.

        // Good Example (see dip.good.* and this controller's constructor)
        // This controller (high-level) depends on NotificationService (abstraction).
        // The NotificationService (mid-level) depends on MessageSender (abstraction).
        // The concrete senders (EmailSender, SmsSender) implement the MessageSender.
        // Spring's DI framework handles injecting the concrete implementations.
        return notificationService.send("This message demonstrates DIP!");
    }
}
