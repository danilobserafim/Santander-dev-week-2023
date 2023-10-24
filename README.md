# Santander-dev-week-2023
Java RESTful API criada para a Santander Dev Week 


```mermaid
classDiagram
  class Usuario {
    - name: String
    - account: Conta
    - features: List<Feature>
    - card: Cartao
    - news: List<Noticia>
    + getName(): String
    + setName(name: String): void
    + getAccount(): Conta
    + setAccount(account: Conta): void
    + getFeatures(): List<Feature>
    + setFeatures(features: List<Feature>): void
    + getCard(): Cartao
    + setCard(card: Cartao): void
    + getNews(): List<Noticia>
    + setNews(news: List<Noticia>): void
  }

  class Conta {
    - number: String
    - agency: String
    - balance: Double
    - limit: Double
    + getNumber(): String
    + setNumber(number: String): void
    + getAgency(): String
    + setAgency(agency: String): void
    + getBalance(): Double
    + setBalance(balance: Double): void
    + getLimit(): Double
    + setLimit(limit: Double): void
  }

  class Feature {
    - pixIcon: String
    - pixDescription: String
    + getPixIcon(): String
    + setPixIcon(pixIcon: String): void
    + getPixDescription(): String
    + setPixDescription(pixDescription: String): void
  }

  class Cartao {
    - number: String
    - limit: Double
    + getNumber(): String
    + setNumber(number: String): void
    + getLimit(): Double
    + setLimit(limit: Double): void
  }

  class Noticia {
    - newsIcon: String
    - newsDescription: String
    + getNewsIcon(): String
    + setNewsIcon(newsIcon: String): void
    + getNewsDescription(): String
    + setNewsDescription(newsDescription: String): void
  }

  Usuario -- Conta: possui
  Usuario -- Feature: possui
  Usuario -- Cartao: possui
  Usuario -- Noticia: possui




```
