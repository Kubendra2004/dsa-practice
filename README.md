# LeetCode Solutions - DSA & SQL Mastery

**Goal:** Systematic mastery of Data Structures & Algorithms (DSA) and SQL fundamentals through consistent daily practice. Interview-ready solutions with complete documentation.

**Constraint:** Minimum 2 problems per day (evening practice after full-time internship, 9:30 AM - 6:30 PM).

---

## Structure

Each problem lives in `Topic/{number}-{short-title}/` with:

- `{ClassName}.java` — the optimized solution
- `.ipynb` — Python notebook for reinforcement learning
- `README.md` — detailed approach, complexity analysis, and key insights
- `schema.sql` — database schema and sample data (for SQL)
- `solution.sql` — empty query skeleton (for SQL)

---

## 📊 Progress Tracker

### **Arrays Fundamentals**

| #   | Problem                             | Difficulty | Concepts                  | Time/Space                | Status      |
| --- | ----------------------------------- | ---------- | ------------------------- | ------------------------- | ----------- |
| 001 | Two Sum                             | Easy       | Hash Map, One-Pass        | O(n) / O(n)               | ✅ Complete |
| 002 | Contains Duplicate                  | Easy       | Hash Set, Early Exit      | O(n) / O(n)               | ✅ Complete |
| 003 | Best Time to Buy and Sell Stock     | Easy       | Greedy, One-Pass Tracking | O(n) / O(1)               | ✅ Complete |
| 004 | Two Sum II (Sorted)                 | Easy       | Two-Pointer               | O(n) / O(1)               | ✅ Complete |
| 005 | Longest Substring Without Repeating | Easy       | Sliding Window, HashMap   | O(n) / O(min(n, charset)) | ✅ Complete |
| 006 | Container With Most Water           | Easy       | Two-Pointer, Area Formula | O(n) / O(1)               | ✅ Complete |
| 007 | Subarray Sum Equals K             | Medium     | Prefix Sum, HashMap     | O(n) / O(n)               | ✅ Complete |
| 008 | Find Pivot Index                | Easy       | Prefix Sum / Running Sum | O(n) / O(1)               | ✅ Complete |
| 009 | Move Zeroes                     | Easy       | Two-Pointer, In-Place   | O(n) / O(1)               | ✅ Complete |
| 010 | Remove Duplicates from Sorted   | Easy       | Two-Pointer, Slow/Fast  | O(n) / O(1)               | ✅ Complete |

### **SQL Fundamentals**

| #   | Problem                 | Difficulty | Concepts                            | Status      |
| --- | ----------------------- | ---------- | ----------------------------------- | ----------- |
| 001 | Employees by Department | Easy       | JOIN, GROUP BY, HAVING, Aggregation | ✅ Complete |
| 002 | Find Duplicate Emails   | Easy       | GROUP BY, HAVING, COUNT             | ✅ Complete |
| 003 | Customers Who Never Order | Easy     | LEFT JOIN, IS NULL                   | ✅ Complete |
| 004 | University SELECT/WHERE | Easy      | SELECT, WHERE, ORDER BY              | ⏳ In Progress |

---

## 🎯 Learning Path

**Fundamentals (Core Patterns)**
✅ Hashing & Sets (Contains Duplicate, Two Sum)  
✅ Greedy Algorithms (Stock Problem)  
✅ Two-Pointer Technique (Two Sum II)  
✅ Two-Pointer Variants (Container With Most Water)  
✅ Two-Pointer: Move Zeroes, Remove Duplicates (Complete - 2 of 2)  
✅ Prefix Sums (Complete - 2 of 2)  
⏳ Stack & Queue (Later)  
⏳ Advanced Patterns (Later)

### Upcoming: **SQL Fundamentals**

⏳ Basic SELECT, WHERE, JOIN, ORDER BY (In Progress)
⏳ GROUP BY, HAVING, Aggregations
⏳ Subqueries & CTEs

---

## 📁 Directory Layout

```
leetcode-solutions/
├── README.md                          (this file)
├── Arrays/
│   ├── 001-two-sum/
│   │   ├── TwoSum.java
│   │   └── README.md
│   ├── 002-contains-duplicate/
│   │   ├── ContainsDuplicate.java
│   │   ├── contains_duplicate.ipynb
│   │   └── README.md
│   ├── 003-best-time-buy-sell-stock/
│   │   ├── BestTimeToBuySellStock.java
│   │   ├── best_time_buy_sell_stock.ipynb
│   │   └── README.md
│   └── 004-two-sum-ii-sorted/
│       ├── TwoSumII.java
│       ├── two_sum_ii.ipynb
│       └── README.md
│   ├── 005-longest-substring-no-repeating/
│   │   ├── LongestSubstringNoRepeating.java
│   │   ├── longest_substring.ipynb
│   │   └── README.md
│   ├── 006-container-with-most-water/
│   │   ├── ContainerWithMostWater.java
│   │   ├── container_with_most_water.ipynb
│   │   └── README.md
│   ├── 007-subarray-sum-equals-k/
│   │   ├── SubarraySumEqualsK.java
│   │   ├── subarray_sum_equals_k.ipynb
│   │   └── README.md
│   ├── 008-find-pivot-index/
│       ├── FindPivotIndex.java
│       ├── find_pivot_index.ipynb
│       └── README.md
│   ├── 009-move-zeroes/
│   │   ├── MoveZeroes.java
│   │   ├── move_zeroes.ipynb
│   │   └── README.md
│   └── 010-remove-duplicates/
│       ├── RemoveDuplicates.java
│       ├── remove_duplicates.ipynb
│       └── README.md
└── SQL/
    ├── 001-employees-by-department/
    │   ├── README.md
    │   ├── schema.sql
    │   └── solution.sql
    ├── 002-duplicate-emails/
    │   ├── README.md
    │   ├── schema.sql
    │   └── solution.sql
    └── 003-customers-who-never-order/
        ├── README.md
        ├── schema.sql
        └── solution.sql
    └── 004-university-basic-select/
        ├── README.md
        ├── schema.sql
        └── solution.sql
```

---

## 🚀 Key Milestones & Ratings

### Session 1: Foundational Hashing and SQL

**Problems:** 2 DSA + 1 SQL
**Rating:** 10/10

- ✅ Hashing pattern mastered
- ✅ Greedy one-pass solution mastered
- ✅ SQL JOIN + GROUP BY + HAVING mastered

### Session 2: July 23, 2026 (Evening)

**Problems:** 2 (Two Sum II, SQL: Find Duplicate Emails)  
**Rating:** 9.7/10

- ✅ Two-pointer technique mastered
- ✅ Group-based filtering mastered

### Session 3: July 23-27, 2026 (Completed)

**Problems:** 2 DSA + 1 SQL  
**Rating:** 10/10

- ✅ Longest Substring Without Repeating Characters completed - 10/10
- ✅ Container With Most Water completed - 10/10
- ✅ SQL: Find Duplicate Emails completed - 10/10

### Session 4: July 27-28, 2026 (Completed)

**Problems:** 2 DSA + 1 SQL  
**Rating:** 8.7/10

- ✅ Subarray Sum Equals K completed - 8/10
- ✅ Find Pivot Index completed - 6/10
- ✅ SQL: Customers Who Never Order completed - 7/10

### Session 5: July 28-29, 2026 (Completed)

**Problems:** 2 DSA + 1 SQL  
**Rating:** TBD

- ✅ DSA 009: Move Zeroes (LC 283) - 3/5
- ✅ DSA 010: Remove Duplicates from Sorted Array (LC 26) - 3/5
- ⏳ SQL 004: University SELECT/WHERE/ORDER BY (still in progress)

### Session 6: Upcoming

**Problems:** TBD

---

## 💡 Interview Preparation

Each problem README includes:

- **Approach**: Step-by-step breakdown
- **Complexity**: Time and space analysis
- **Code**: Optimized implementation
- **Key Insights**: Learning patterns
- **Edge Cases**: Handled scenarios
- **Related Problems**: Pattern variations
- **Interview Rating**: ⭐ (1-5 stars)

---

## 🔧 Tech Stack

- **Languages**: Java (primary), Python (reinforcement)
- **SQL Dialects**: General SQL (compatible with PostgreSQL, MySQL, SQLite)
- **Tools**: VS Code, Git, Jupyter Notebooks
