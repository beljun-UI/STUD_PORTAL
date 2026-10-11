# Student Portal (STUD.PORTAL)

A modern, responsive Android application built with Java for student authentication and portal access.

---

## Features

* **Login System**: Email and password entry with input validation and Toast feedback.
* **User Registration**: Sign up screen with password confirmation matching and account creation routing.
* **Custom UI & Styling**:
  * Unified brand blue theme (`#0046C7`).
  * Custom rounded text inputs (`rounded_edittext`) and primary action buttons (`rounded_button`).
  * Integrated custom typography (`Archivo Black` / `sans-serif-condensed`).
  * Matching status bar color integration for a borderless aesthetic.
* **Activity Navigation**: Intent-based navigation connecting `MainActivity` (Login), `SignUpActivity` (Registration), and `SecondActivity` (Dashboard).

---

## Tech Stack & Requirements

* **Language**: Java
* **IDE**: Android Studio
* **UI Framework**: Android XML (`ScrollView`, `LinearLayout`, Material Components)
* **Build System**: Gradle (KTS / Groovy)
* **Min SDK**: API 21+ (Android 5.0 Lollipop or newer)

---

 ## Project Structure

```text
STUDPORTAL/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/studportal/
│           │   ├── MainActivity.java
│           │   ├── SignUpActivity.java
│           │   └── SecondActivity.java
│           └── res/
│               ├── drawable/
│               │   ├── rounded_button.xml
│               │   ├── rounded_edittext.xml
│               │   └── profilepic_logo.png
│               ├── layout/
│               │   ├── activity_main.xml
│               │   └── activity_sign_up.xml
│               └── values/
│                   └── themes.xml
