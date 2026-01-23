# Tamagotchi Exercise - Debugging in IntelliJ IDEA

## Project Description

This project implements a virtual Tamagotchi in Java, a digital pet that has different states based on its hunger, energy, and mood levels. The main objective is to practice debugging techniques using breakpoints in IntelliJ IDEA.

## Project Structure

```
tamagotchi/
├── src/
│   ├── Tamagotchi.java
│   └── Main.java (or test class)
└── README.md
```

## Tamagotchi Features

The `Tamagotchi` class includes:

- **Attributes**: `hunger`, `energy`, `mood`
- **Main methods**:
    - `play()`: Plays with the Tamagotchi (increases hunger and mood, decreases energy)
    - `eat()`: Feeds the Tamagotchi (decreases hunger and energy)
    - `sleep()`: Sleeps and recovers energy
    - `toString()`: Shows the current state with emojis

## Implemented Breakpoints

### Breakpoint 1: `play()` Method - First `if` statement line

**Location**: After modifying the attributes, right at the line `if (energy == 0)`

**Purpose**:
- Verify how the values of `hunger`, `mood`, and `energy` changed after playing
- Observe which condition will be met and what emoji will be returned

**Variables to observe**:
```
this.hunger (value after +1)
this.mood (value after +1)
this.energy (value after -1)
```

### Breakpoint 2: Constructor - Last line

**Location**: After `this.mood = 4;`

**Purpose**:
- See the initial state of the Tamagotchi when it's created
- Confirm that all attributes are initialized correctly

**Variables to observe**:
```
this.hunger = 4
this.energy = 4
this.mood = 4
```

## Debugging Instructions in IntelliJ IDEA

### 1. Initial Setup

1. Open the project in IntelliJ IDEA
2. Make sure the JDK is configured correctly
3. Open the `Tamagotchi.java` file

### 2. Place Breakpoints

1. Click on the left margin (next to the line numbers) at the indicated locations
2. A red circle 🔴 will appear indicating the active breakpoint
3. Breakpoints can be activated/deactivated by clicking on them

### 3. Run in Debug Mode

1. Go to the `Main.java` class (or your test class)
2. **Right-click** on the file
3. Select **"Debug 'Main'"** (has a bug icon 🐛)
4. Or use the keyboard shortcut: **Shift + F9**

### 4. Analyze the Flow

During debugging:
- The program will stop at each breakpoint
- The "Debug" panel will appear at the bottom with the "Debugger" tab
- Observe the **"Variables"** section to see the current values of `this.hunger`, `this.energy`, and `this.mood`
- Use the debug controls (top bar of the Debug panel):
    - **Resume Program (F9)**: Continue to the next breakpoint
    - **Step Over (F8)**: Execute the current line and advance
    - **Step Into (F7)**: Enter inside methods
    - **Step Out (Shift+F8)**: Exit the current method
    - **View Breakpoints (Ctrl+Shift+F8)**: View all project breakpoints

## Screenshots

### 1. Complete Code
![Complete Tamagotchi class code](screenshots/complete_code.png)

*Shows the complete implementation of the Tamagotchi class with all its methods.*

---

### 2. Breakpoint 1 - play() Method
![Breakpoint in play method](screenshots/breakpoint_1.png)

*Screenshot of the program stopped at the first breakpoint, showing how the values changed after playing with the Tamagotchi.*

---

### 3. Breakpoint 2 - Constructor
![Breakpoint in constructor](screenshots/breakpoint_2.png)

*Screenshot of the program stopped at the constructor, showing the initialization of attributes.*

---

### 4. Variables Panel
![Variables state in debug](screenshots/variables_debug.png)

*Detailed view of the variables panel showing the real-time values of `hunger`, `energy`, and `mood`.*

## Debugging Process Observations

### Observed Execution Flow

1. **Object creation**:
    - The constructor initializes all values to 4
    - Breakpoint 2 confirms correct initialization

2. **First call to `play()`**:
    - hunger: 4 → 5
    - mood: 4 → 5
    - energy: 4 → 3
    - Result: ":-|" (neutral state)

3. **Second call to `play()`**:
    - hunger: 5 → 6
    - mood: 5 → 6
    - energy: 3 → 2
    - Result: "(-_-)" (tired)

### Conclusions

- Breakpoints allowed verification that the attribute modification logic works correctly
- It was clearly observed how each action affects the Tamagotchi's state
- The if-else condition flow correctly determines the emoji to display based on the values

## How to Run the Project

```bash
# Compile
javac Tamagotchi.java Main.java

# Run
java Main
```

## Technologies Used

- Java 8 or higher
- IntelliJ IDEA (Community or Ultimate Edition)
- IntelliJ IDEA integrated debugging tools

## Author

[Nerea Ros Ocaña]
