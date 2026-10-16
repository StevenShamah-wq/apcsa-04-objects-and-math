# AP CSA — Assignment 04: Objects, the API and Math
**Creating objects, reading the Java API like a professional, and the Math class. Sessions 13-15.**

Yeshivah of Flatbush · AP Computer Science A · 2026-27

---

## How to work

1. **Fork** this repo to your own account (Fork button, top right).
2. Open your fork in a **Codespace** (green Code button > Codespaces tab > Create codespace on main).
3. Do the exercise in class, then the homework. **Commit with a real message** and push.
4. Submit the URL of **your fork** (it must have your username in it) in Google Classroom.
5. Stop your Codespace when you are done.

## Exercises

| Session | File | Type | Name |
|---|---|---|---|
| S13 | `src/ObjectLab.java` | Classwork | ObjectLab |
| S13 | `exercises/03-references.md` | Homework | Reference Drills |
| S14 | `src/DocsDetective.java` | Classwork | DocsDetective |
| S14 | `exercises/04-api-scavenger-hunt.md` | Homework | API Scavenger Hunt |
| S15 | `src/DiceSimulator.java` | Classwork | DiceSimulator |
| S15 | `src/MathToolkit.java` | Homework | MathToolkit |

## Traps to watch for

- **A variable holds an address.** `Pet b = a;` copies the address, so there is still one Pet.
- **null means no object.** Calling a method on it crashes with a NullPointerException; the line number tells you where.
- **Random range:** `(int)(Math.random() * n) + min` gives n values starting at min. `(int) Math.random() * 6` is always 0.

Slides for every session are in the [apcsa-slides](https://github.com/afarhadi99/apcsa-slides) repo.
