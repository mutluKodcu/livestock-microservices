# Livestock Microservices

## Table of Contents
1. [Mikroservisler ve Modüller](#mikroservisler-ve-modüller)
    - [Roadmap](#roadmap)
    - [Animal Service CRUD + veritabanı](#animal-service-crud--veritabani)
    - [Stream Processor (Kafka entegrasyonu)](#stream-processor-kafka-entegrasyonu)
    - [Finance & Accounting Service (gelir-gider, ciro raporu)](#finance--accounting-service-gelir-gider-ciro-raporu)
    - [Notification & Rule Service (SMS/Email entegrasyonu)](#notification--rule-service-smsemail-entegrasyonu)
    - [Reporting & Dashboard (grafikler, PDF/Excel raporlar)](#reporting--dashboard-grafikler-pdfexcel-raporlar)
    - [NLP & Decision Support (veteriner notu analizi)](#nlp--decision-support-veteriner-notu-analizi)
    - [Docker & Docker Compose (lokal geliştirme)](#docker--docker-compose-lokal-gelistirme)
    - [CI/CD + Flyway veri migrasyonları](#cicd--flyway-veri-migrasyonlari)
2. [Animal Service](#animal-service)
3. [Stream Processor](#stream-processor)
    - [Kafka & Redis Entegrasyonu](#kafka--redis-entegrasyonu)
4. [Finance & Accounting Service](#finance--accounting-service)
5. [Reporting & Dashboard](#reporting--dashboard)
6. [Notification & Rule Service](#notification--rule-service)
7. [NLP & Decision Support](#nlp--decision-support)
8. [UML Diyagramları](#uml-diyagramlari)

---

# Mikroservisler ve Modüller

## Roadmap
- Animal Service CRUD + veritabanı
- Stream Processor (Kafka entegrasyonu)
- Finance & Accounting Service (gelir-gider, ciro raporu)
- Notification & Rule Service (SMS/Email entegrasyonu)
- Reporting & Dashboard (grafikler, PDF/Excel raporlar)
- NLP & Decision Support (veteriner notu analizi)
- Docker & Docker Compose (lokal geliştirme)
- CI/CD + Flyway veri migrasyonları

---

## Animal Service CRUD + veritabanı
- Hayvan CRUD
- Veteriner notları ve üretim kayıtları
- PostgreSQL veri tabanı
- Kafka `animal.events` topic’ine veri üretir

---

## Stream Processor (Kafka entegrasyonu)
- IoT sensör verilerini işleme (ETL)
- Kafka `sensor.readings` topic’ini dinler
- `alerts` topic’ine uyarı üretir
- Redis Cache ile anlık veri takibi

### Kafka & Redis Entegrasyonu
- Kafka Topics: `sensor.readings`, `animal.events`, `alerts`
- Redis: Pub/Sub bildirimler ve geçici veri cache

---

## Finance & Accounting Service (gelir-gider, ciro raporu)
- Gelir-gider takibi (günlük, aylık, yıllık)
- Ciro ve karlılık raporları
- İşletme defteri (bakım, yem, veteriner, giderler)
- Öneri ve kritik uyarılar

---

## Reporting & Dashboard (grafikler, PDF/Excel raporlar)
- Recharts ile grafik görselleştirme
- JasperReports ile PDF/Excel raporlama
- Hayvan ve finans verilerinin görselleştirilmesi

---

## Notification & Rule Service (SMS/Email entegrasyonu)
- Redis Pub/Sub üzerinden SMS/Email/Mobil bildirim
- Hayvan bazlı alarmlar ve üretim/sağlık uyarıları

---

## NLP & Decision Support (veteriner notu analizi)
- Veteriner serbest metin notlarını analiz eder
- Öneri ve erken uyarılar üretir


---

## Docker & Docker Compose (lokal geliştirme)
- Lokal geliştirme için Docker ve Docker Compose konfigürasyonları

---

## CI/CD + Flyway veri migrasyonları
- CI/CD pipeline ve Flyway veri migrasyonları

---

# UML Diyagramları
- Class diagram: Animal, Finance, Sensor
- Sequence diagram: SensorReading → Kafka → StreamProcessor → Redis → Notification
- Deployment diagram: Docker, Microservices, Kafka, Redis
