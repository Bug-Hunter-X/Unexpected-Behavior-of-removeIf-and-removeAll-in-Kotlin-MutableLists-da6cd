# Kotlin MutableList removeIf and removeAll Unexpected Behavior

This repository demonstrates an unexpected behavior of Kotlin's `removeIf` and `removeAll` functions when used with mutable lists.  These functions modify the list in place, which can lead to unexpected results if not carefully considered.

## Problem

The `removeIf` and `removeAll` functions don't return a new list; they modify the original list directly.  This can be problematic if you're not aware of this behavior and expect a new list to be returned. The example in `bug.kt` illustrates this.

## Solution

The best approach is to be mindful of this behavior and explicitly create a copy of the list before performing these operations if you want to retain the original list.  See `bugSolution.kt` for a corrected approach.

## How to Run

1. Clone this repository.
2. Open the project in your favorite Kotlin IDE (IntelliJ IDEA is recommended).
3. Run the `bug.kt` and `bugSolution.kt` files to see the difference in behavior.