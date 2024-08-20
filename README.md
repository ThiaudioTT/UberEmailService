# Uber Email Service

This is a simple email service that sends emails to users. It is built using Spring Boot and Java.

And also is an Uber challenge, you can see the challenge [here](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).

Do not use for production purposes.


## Running and setting up the project

First, you need to obtain the API keys from the providers. See the [application.properties](src/main/resources/application.properties),
locate these keys, and set them in the file.

To run the project, you must have Java and Maven installed. Then, you can run the following command:

```bash
  mvn spring-boot:run
```

## Sending the email

With all setup done, you can now email to a user. To do this, you need to make a POST request to the `/email/send` endpoint with the following payload:

```json
{
  "from": "senderRegistred@email.com",
  "to": "emailTo@email.com",
  "subject": "Hello, I am the subject",
  "body": "Yes, all the body of the email"
}
```

Attention that some providers like amazon SES, you need to verify the sender email before send the email.


<img src="https://cdn.donmai.us/sample/3b/0b/__otogi_blue_archive_and_1_more_drawn_by_tkugane__sample-3b0b2760abb54414bf6d54605782d3f9.jpg" width="200px">