# 🚀 App Build — Session Tracker

> Paste this at the start of every new chat session to keep Claude in sync.
> Update the "Current Status" and "Last Session" sections after every session.

---

## 📌 Project Overview

- **App Type:** B2C Transactional App
- **User Roles:** 3 or more (e.g., Customer / Provider / Admin)
- **Core Action:** Buy / Book / Pay
- **Backend:** Java + Spring Boot (Microservices)
- **Web Frontend:** React + TypeScript
- **Mobile:** React Native (Android)
- **Database:** PostgreSQL + Redis
- **Messaging:** Kafka (inter-service events)
- **Auth:** JWT + Spring Security
- **API Gateway:** Spring Cloud Gateway
- **DevOps:** Docker (later stage)

---

## 🗺️ Microservices Roadmap

| # | Service | Status | Started | Completed |
|---|---------|--------|---------|-----------|
| 1 | User & Auth Service | 🔲 Not Started | — | — |
| 2 | Profile Service | 🔲 Not Started | — | — |
| 3 | Catalog / Listing Service | 🔲 Not Started | — | — |
| 4 | Order / Booking Service | 🔲 Not Started | — | — |
| 5 | Payment Service | 🔲 Not Started | — | — |
| 6 | Notification Service | 🔲 Not Started | — | — |
| 7 | API Gateway | 🔲 Not Started | — | — |
| 8 | Admin Service | 🔲 Not Started | — | — |

**Status Legend:** 🔲 Not Started | 🔄 In Progress | ✅ Done | ⏸️ Paused

---

## ⚡ Current Status

> Update this section at the end of every session.

- **Active Service:** User & Auth Service
- **Current Phase:** [ ] Design | [ ] Coding | [ ] Testing | [ ] Integrated
- **Today's Date:** _______________
- **Sessions Completed:** 0
- **Total Hours Logged:** 0 hrs

---

## 📅 Last Session Summary

> Fill this in at the end of each session so you can paste it next time.

**Date:** _______________
**Duration:** _______________
**What we did:**
-
-
-

**Decisions made:**
-
-

**Blockers / Issues:**
-

**Next task (pick up from here):**
>

---

## 🧱 Architecture Decisions Log

> Record every significant design/tech decision here for future reference.

| Date | Decision | Reason |
|------|----------|--------|
| — | Using JWT for auth | Stateless, scalable for microservices |
| — | PostgreSQL as primary DB | Relational data, strong consistency |
| — | Kafka for async events | Decoupled inter-service communication |
| | | |

---

## 📁 Project Structure

```
/project-root
├── /auth-service          # Service 1 — User & Auth
├── /profile-service       # Service 2 — Profiles
├── /catalog-service       # Service 3 — Catalog/Listings
├── /order-service         # Service 4 — Orders/Bookings
├── /payment-service       # Service 5 — Payments
├── /notification-service  # Service 6 — Notifications
├── /api-gateway           # Service 7 — API Gateway
├── /admin-service         # Service 8 — Admin
├── /web-frontend          # React + TypeScript
└── /mobile-app            # React Native (Android)
```

---

## 🔐 Service 1: User & Auth Service

**Goal:** Handle registration, login, JWT tokens, and role management.

### Checklist
- [ ] Project setup (Spring Boot, dependencies)
- [ ] Database schema — Users table with roles
- [ ] User Registration API (`POST /auth/register`)
- [ ] User Login API (`POST /auth/login`)
- [ ] JWT token generation & validation
- [ ] Role-based access control (RBAC)
- [ ] Refresh token logic
- [ ] Unit tests
- [ ] Postman / API testing
- [ ] Docker containerization

### API Endpoints
| Method | Endpoint | Description | Status |
|--------|----------|-------------|--------|
| POST | `/auth/register` | Register new user | 🔲 |
| POST | `/auth/login` | Login, returns JWT | 🔲 |
| POST | `/auth/refresh` | Refresh JWT token | 🔲 |
| POST | `/auth/logout` | Invalidate token | 🔲 |
| GET | `/auth/me` | Get current user | 🔲 |

### Notes
>

---

## 🗒️ Concepts Learned Log

> Track every new concept you learn — great for revision!

| Session # | Concept | Service | Notes |
|-----------|---------|---------|-------|
| — | — | — | — |

---

## 🔗 Useful Links

- GitHub Repo: _______________
- Postman Collection: _______________
- DB Schema Diagram: _______________
- API Docs: _______________

---

## 💬 How to Start a New Chat Session

Paste the following at the top of every new chat:

```
Hi! I'm building a B2C transactional app with microservices (Java/Spring Boot backend,
React web, React Native Android). Here's my current status:

- Active service: [X]
- Last session: [paste Last Session Summary here]
- Next task: [paste next task here]

Let's continue from where we left off.
```

---

*Last updated: _______________*
