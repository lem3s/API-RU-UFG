<h1 > API RU UFG 🍲</h1>

A Web Api that allow the academic community to make integrations with the University Restaurant data.

---

## Table of Contents

- [Requirements](#requirements)
- [System Design](#system-design)

---

## Requirements

- **The system must allow users to:**
  - **[Request for the today's menu for each meal]**.
  - **[Request all today meals]**.
  - **[Request the week meals]**.
  - **[Request the meals of a specific date]**.

- **User Stories**:
  - *As a user, I want to **[make a request for today meals]**, so that I can **[integrate with my application]***.
  - *As a user, I want to **[make a request for the meals on January 25th 2025]**, so that I can **[integrate with my application]***.

---

## System Design

This section provides an overview of the project architecture and design.

### Architecture Overview

Provide a high-level overview of the architecture, tools, and services. Use diagrams when possible.

- **System Components**:
  - Backend: *e.g., Express.js for API development*
  - Frontend: *e.g., React.js or Vue.js*
  - Database: *e.g., PostgreSQL, Redis for caching*
  - CI/CD: *e.g., GitHub Actions*

### Design Diagrams

Include design diagrams, such as:

- **High-Level Architecture**
  ```
  User --> Frontend --> Backend --> Database
  
  Optional: Add an API Gateway or Queue Management as needed.
  ```
- **ERD (Entity-Relationship Diagram)**
  - Example: Database schema (if applicable)

- **Flowchart**
  ```
  1. User Request --> 2. API --> 3. Processing --> 4. Response
  ```

---
