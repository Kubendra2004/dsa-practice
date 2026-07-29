# SQL Problem 005: Employee Bonus

## Problem Statement
Write a SQL query to find all employees whose bonus is less than 1000. Return their name and bonus amount (NULL if they have no bonus record).

## Concept
- **LEFT JOIN** — keep all employees and include those without bonus records
- **IS NULL** — handle employees with no bonus entry
- **OR** — combine conditions for missing and low bonuses

## Difficulty
Easy

## Schema

### Table: `Employee`
| Column Name  | Type      | Description              |
|--------------|-----------|--------------------------|
| id           | INT       | Employee ID (PK)       |
| name         | VARCHAR   | Employee name            |
| managerId    | INT       | References Employee.id   |

### Table: `Bonus`
| Column Name | Type | Description       |
|-------------|------|-------------------|
| id          | INT  | Employee ID (FK) |
| amount      | INT  | Bonus amount      |

## Sample Data

**Employee:**
```
id | name  | managerId
---|-------|----------
1  | John  | NULL
2  | Dan   | 1
3  | Mike  | 1
4  | Ralph | NULL
5  | Tom   | 1
```

**Bonus:**
```
id | amount
---|--------
2  | 500
4  | 2000
```

## Expected Output

```
name | bonus
-----|------
Dan  | 500
John | NULL
Mike | NULL
Tom  | NULL
```

**Explanation:** Ralph is excluded because he has a bonus of 2000. John, Mike, and Tom have no bonus record (NULL) which is less than 1000. Dan has a bonus of 500 which is less than 1000.

## Constraints
- Employee id is the primary key
- Bonus id references Employee id
- Bonus amount can be NULL (no bonus record)

## Hints (Don't peek unless stuck!)
1. Use a **LEFT JOIN** from Employee to Bonus on `Employee.id = Bonus.id`. This keeps all employees even if they have no bonus record.
2. Use `IS NULL` to check for missing bonus records.
3. Use `OR` to combine the condition `amount < 1000` with `amount IS NULL`.
4. Alternatively, use `COALESCE(b.amount, 0) < 1000` to treat NULL as 0.

---

**Next Step:** Write your query in `solution.sql` and verify it against the sample data.

**Interview Rating:** 5/10