# Project Structure

```
src/main/java/com/uberchallenge/UberEmailService/
│
├── controller/
│   └── EmailController.java         # REST controllers
│
├── domain/
│   ├── Email.java                   # Email domain model
│   ├── repository/
│   │   └── EmailRepository.java     # Repository interface (if needed)
│   └── service/
│       ├── EmailService.java        # Email service interface
│       ├── EmailServiceManager.java # Service managing failover
│       ├── PrimaryEmailService.java # Implementation of primary email service
│       └── SecondaryEmailService.java # Implementation of secondary email service
│
├── infra/
│   └── config/
│       └── EmailServiceConfig.java  # Configuration classes
│
└── UberEmailServiceApplication.java # Main application class

```