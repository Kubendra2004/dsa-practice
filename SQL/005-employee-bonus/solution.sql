{
 "cells": [
  {
   "cell_type": "markdown",
   "id": "a1b2c3d4",
   "metadata": {},
   "source": [
    "# SQL Problem 005: Employee Bonus\n",
    "\n",
    "## Problem Statement\n",
    "Write a SQL query to find all employees whose bonus is less than 1000. Return their name and bonus amount (NULL if they have no bonus record).\n",
    "\n",
    "## Concept\n",
    "**LEFT JOIN** + **IS NULL** — keep all employees and include those without bonus records.\n",
    "\n",
    "## Difficulty\n",
    "Easy\n",
    "\n",
    "## Schema\n",
    "\n",
    "### Table: `Employee`\n",
    "| Column Name  | Type      | Description              |\n",
    "|--------------|-----------|--------------------------|\n",
    "| id           | INT       | Employee ID (PK)        |\n",
    "| name         | VARCHAR   | Employee name            |\n",
    "| managerId    | INT       | References Employee.id   |\n",
    "\n",
    "### Table: `Bonus`\n",
    "| Column Name | Type | Description        |\n",
    "|-------------|------|--------------------|\n",
    "| id          | INT  | Employee ID (FK) |\n",
    "| amount      | INT  | Bonus amount       |\n",
    "\n",
    "## Sample Data\n",
    "\n",
    "**Employee:**\n",
    "```\n",
    "id | name  | managerId\n",
    "---|-------|----------\n",
    "1  | John  | NULL\n",
    "2  | Dan   | 1\n",
    "3  | Mike  | 1\n",
    "4  | Ralph | NULL\n",
    "5  | Tom   | 1\n",
    "```\n",
    "\n",
    "**Bonus:**\n",
    "```\n",
    "id | amount\n",
    "---|--------\n",
    "2  | 500\n",
    "4  | 2000\n",
    "```"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "b2c3d4e5",
   "metadata": {},
   "outputs": [],
   "source": [
    "-- Task 1: List all employees with their bonus amounts\n",
    "-- using LEFT JOIN\n",
    "\n",
    "SELECT e.name, b.amount\n",
    "FROM Employee e\n",
    "LEFT JOIN Bonus b ON e.id = b.id\n",
    "ORDER BY e.name;"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "c3d4e5f6",
   "metadata": {},
   "outputs": [],
   "source": [
    "-- Task 2: Find employees with bonus less than 1000\n",
    "-- (including those with no bonus record)\n",
    "\n",
    "SELECT e.name, b.amount\n",
    "FROM Employee e\n",
    "LEFT JOIN Bonus b ON e.id = b.id\n",
    "WHERE b.amount < 1000 OR b.amount IS NULL\n",
    "ORDER BY e.name;"
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.12.9"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}