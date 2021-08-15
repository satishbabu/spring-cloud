# Spring Cloud Microservices - version 2 with updated components   
This project will have microservices using the latest spring cloud components


## Ports
| Service | Port |
| ------- | ---- |
| Limits Services | 8080 |
| Spring Config Server | 8888 |
| Currency Exchnage Service | 8000 |


## Autoreload in intellij
During development it is good to hvae live reload when any file changes.  It is provided by spring dev tools.  For it to take effect we have to set the following in intellij.  Go to: file->settings->build,execution,deployment. Go to ->compiler->build project automatically.

## URLs
Currency Exchange service
http://localhost:8000/currency-exchange/from/USD/to/INR

Currency Conversion service
http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10

