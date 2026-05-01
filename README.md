# 📝 My Notes App - Kotlin Multiplatform

A powerful, offline-first notes management application built with Kotlin Multiplatform (KMP), featuring a modern Material 3 design and persistent local storage.

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
