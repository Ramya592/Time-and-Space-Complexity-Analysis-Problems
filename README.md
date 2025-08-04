# Time-and-Space-Complexity-Analysis-Problems

# 🧠 Time and Space Complexity Analysis Problems

This repository contains a collection of Java programs and theoretical explorations that analyze algorithm performance with a focus on **time complexity**, **space complexity**, and **real-world effects** like **cache behavior** and **CPU cycles**.

## 📂 Structure

Each folder or file contains:

- ✅ Problem statement
- 🔎 Theoretical complexity analysis (Big-O)
- 🖥️ Java implementation
- 📈 Empirical analysis using `System.nanoTime()` or `System.currentTimeMillis()`
- 💬 Observations (cache effects, memory overhead, etc.)

## 🧪 Topics Covered

- Median maintenance using heaps (O(log n) insertion, O(1) retrieval)
- Recurrence relations and their runtime implications
- Effect of cache misses on CPU cycles
- Array access patterns: sequential vs random
- Comparison of algorithmic vs real execution time
- Memoization vs recursion (space-time tradeoffs)

## 📊 Sample Output & Interpretation

Programs are designed to:
- Measure and print time taken for various operations
- Show performance differences due to access patterns
- Reveal how theoretical complexity differs from practical execution

Example:
```text
Sequential access time: 24 ms  
Random access time: 219 ms  
