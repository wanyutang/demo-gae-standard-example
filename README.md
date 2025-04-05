# Spring Boot on App Engine（實作練習專案）

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.0+-green?logo=springboot&style=flat)
![Google Cloud](https://img.shields.io/badge/Google_Cloud-App_Engine-blue?logo=googlecloud&style=flat)
![Maven](https://img.shields.io/badge/Build-Maven-orange?logo=apachemaven&style=flat)

本專案為 Google 官方 Codelab 課程  
[Deploying a Spring Boot app to the Google Cloud App Engine Standard Environment](https://codelabs.developers.google.com/codelabs/cloud-app-engine-springboot) 的實作練習版本。

此版本將會補充個人操作筆記，並保留實作後的程式碼，以利學習與回顧。

---

## 📚 教學內容重點

本教學內容涵蓋：

- 建立並撰寫簡單的 Spring Boot Web 應用程式
- 配置 `app.yaml` 以部署至 Google App Engine（Standard）
- 使用 Maven 打包與部署
- 瞭解 GAE 的部署流程與專案結構

---

## 📁 專案結構

此 repository 包含：

- 由 [start.spring.io](https://start.spring.io) 產生的原始 Spring Boot 專案
- 課程步驟實作後的修改內容
- `notes/` 資料夾中為逐步實作筆記（未來補上）
- Google App Engine 所需設定檔案（如 `app.yaml`）

---

## 🚀 快速開始

若你希望在本機端執行此應用程式：

```bash
git clone https://github.com/wanyutang/demo-gae-standard-example.git
cd demo-gae-standard-example
./mvnw spring-boot:run
```

若你已完成 GCP 初始化並安裝 gcloud CLI，可直接部署至 GAE：

```bash
gcloud app deploy
```

請確保 GCP 專案已啟用計費與 App Engine API。

---

## 📝 筆記與實作紀錄

筆記預計放置於 `notes/` 資料夾，內容包含：

- 各步驟實作說明
- 與官方教學不同之處
- 錯誤紀錄與解法
- 延伸學習思路與備忘

---

## ✅ 目前進度

- [x] 初始化 Spring Boot 專案
- [x] 設定 Git 與推送至 GitHub
- [ ] 完成 GAE 配置與部署測試
- [ ] 筆記整理中（`notes/` 資料夾）
- [ ] 整理教學補充與疑難排解專區

---

## 📄 授權說明

本專案僅供學習與個人筆記使用，原始教學與框架內容版權屬於其原作者。  
Spring Boot 為 Pivotal Software 的產品；Google Cloud App Engine 為 Google 所擁有之服務。