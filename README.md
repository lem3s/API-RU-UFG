<h1 > API RU UFG 🍲</h1>

A Web Api that allow the academic community to make integrations with the University Restaurant data.

---

## Table of Contents

- [Requirements](#requirements)
- [Endpoints](#endpoints)
- [System Design](#system-design)

---

## Requirements

- **The system must allow users to:**

  - **[Request for the today's menu for each meal]**
  - **[Request all today meals]**
  - **[Request the week meals]**
  - **[Request the meals of a specific date]**

- **User Stories**:
  - \*As a user, I want to **[make a request for today meals]**, so that I can **[integrate with my application]\***.
  - \*As a user, I want to **[make a request for the meals on January 25th 2025]**, so that I can **[integrate with my application]\***.

---

## Endpoints

- Get all today meals: `api/menu`
- Get today's menu for a especific meal: `api/menu?time=x`
  > where x ranges from 0 to 2
- Get the week meals: `api/menu/week`
- Get the meals of a specific date: `api/menu?date=20240128`
  > meals from 2024-01-28

---

## System Design

The project has an architecture similar to a layered architecture.

### Architecture Overview

- **System Components**:
  - Backend: _Java Srping Boot for API development_
  - Database: _PostgreSQL_
  - Deploy: _AWS_

### Design Diagrams

- **High-Level Architecture**

![Architecture Overview](./Docs/API-RU-Architecture.png)

- **ERD (Entity-Relationship Diagram)**

  - Example: Database schema (if applicable)

---
