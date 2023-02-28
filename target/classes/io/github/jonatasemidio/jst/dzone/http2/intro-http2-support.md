# Java 9: An Intro to HTTP/2 Support 
### Take a look at where HTTP/2 support stands for Java 9, what problems it solves, and more importantly, what issues still need help from outside libraries.

The IETF streaming group approved the HTTP/2 protocol in 2015, 16 years after HTTP/1.1 had been released. HTTP/2 comes with the promise of lowering latency and makes many workarounds necessary for HTTP/1.1 obsolete in order to be able to keep up with today’s response time requirements.

In this article, I introduce HTTP/2 briefly and how it renews the text-based HTTP/1.1 — and then we will look into the HTTP/2 support in Java 9.

As I mentioned in the introduction, HTTP/1.1 had become old and the web has changed a lot since 1999.

People are getting more and more impatient on the Internet, but they wouldn’t notice that the actions they’re performing on the web aren’t being performed by themselves directly if response times are below 100ms.

When response time goes up to 1 second, that does get noticed, and when it takes longer than 10 seconds for a site to respond, it’s considered to be out of order. According to some research, the average attention span has decreased to 7-8 seconds, and even a 1-second delay could cause a 7% loss in revenue.


[post](https://dzone.com/articles/an-introduction-to-http2-support-in-java-9?edition=334840&utm_source=Weekly%20Digest&utm_medium=email&utm_campaign=Weekly%20Digest%202017-11-08)