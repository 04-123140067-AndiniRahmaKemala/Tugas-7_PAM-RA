# 📝 My Notes App - Kotlin Multiplatform

A powerful, offline-first notes management application built with Kotlin Multiplatform (KMP), featuring a modern Material 3 design and persistent local storage.

## Dokumentasi Visual

| Create Note |  Read & Edit Note | Delete | Delete Output |  Search Note |
| :---: | :---: | :---: | :---: | :---: |
|<img width="324" height="712" alt="Screenshot 2026-05-01 130530" src="https://github.com/user-attachments/assets/400ee8bd-4271-4238-a381-1cfdf28dbec1" /> | <img width="320" height="714" alt="Screenshot 2026-05-01 130724" src="https://github.com/user-attachments/assets/f87ba3ac-920f-4fa7-8819-cd88dca84f6f" /> | <img width="327" height="714" alt="Screenshot 2026-05-01 130545" src="https://github.com/user-attachments/assets/b71127ae-77b5-4902-a70f-fa3160457f88" /> | <img width="326" height="713" alt="Screenshot 2026-05-01 130602" src="https://github.com/user-attachments/assets/83401c59-c06b-4cec-8978-87551f6702cf" /> | <img width="323" height="715" alt="Screenshot 2026-05-01 130621" src="https://github.com/user-attachments/assets/709410d3-0007-432d-9156-d9e853e34935" /> |


##  Video Demo
Video demo fitur aplikasi dapat diakses melalui tautan berikut : https://youtube.com/shorts/elQ8uHpX1Aw?si=Vuo3DXu492FLlLeb 

## 🚀 Key Features

### 1. Local Persistence (SQLDelight)
- **Offline-First**: All your notes are saved locally using SQLDelight, ensuring access without an internet connection.
- **Reliable Storage**: Structured data handling with a robust SQLite backend.

### 2. Full CRUD Operations
- **Create**: Write new stories or notes with category tagging.
- **Read**: View your list of notes, sorted by your preference.
- **Update**: Edit existing titles, content, or categories at any time.
- **Delete**: Remove notes you no longer need.
- **Favorites**: Mark important notes with a heart to see them in a dedicated tab.

### 3. Advanced Search & Filtering
- **Real-time Search**: Find specific notes instantly using the search bar.
- **Category Filtering**: Organize and view notes by tags like "Work", "Education", "Personal", etc.

### 4. User Preferences (DataStore)
- **Theme Settings**: Toggle between Light and Dark mode.
- **Dynamic Sorting**: Sort your notes by Date (Newest/Oldest) or Title (A-Z/Z-A).
- **Profile Management**: Customize your profile name, bio, and contact details.

### 5. Proper UI States
- **Loading**: Smooth progress indicators while data is fetching.
- **Empty States**: Clear messaging and icons when no notes are found.
- **Content State**: Beautiful Material 3 cards for note display.

---

## 🛠️ Database Schema

The application uses **SQLDelight** for database management. Below is the schema for the `NoteEntity` table:

```sql
CREATE TABLE NoteEntity (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    content TEXT NOT NULL,
    date TEXT NOT NULL,
    isFavorite INTEGER AS kotlin.Boolean NOT NULL DEFAULT 0,
    category TEXT NOT NULL DEFAULT 'General'
);
```

---

## 📸 Screenshots

| Notes Home | Note Detail | Add/Edit Note |
|:---:|:---:|:---:|
| ![Notes Screen]() | ![Detail Screen]() | ![Add Screen]() |

| Favorites | Profile | Edit Profile |
|:---:|:---:|:---:|
| ![Favorites Screen]() | ![Profile Screen]() | ![Edit Profile]() |

---

## 📂 Project Structure
- `sqldelight/`: SQL schema and query definitions.
- `data/`: Repository pattern and DataStore (Settings) implementation.
- `viewmodel/`: State management using Kotlin Coroutines and Flow.
- `ui/`: Compose Multiplatform components and screens.

---
**Developed by:** Andinirhm 🌸
**Course:** Pengembangan Aplikasi Mobile (PAM)
