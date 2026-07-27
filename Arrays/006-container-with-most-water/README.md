# LeetCode 11: Container With Most Water

## Problem

Given an integer array `height`, find two lines that together with the x-axis form a container that holds the maximum amount of water.

## Pattern

Two Pointers

## Core Idea

Start with the widest possible container and move the pointer at the shorter line inward. The width shrinks on every step, so the only way to possibly improve area is to look for a taller boundary.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- Minimum input size of 2
- Equal heights on both ends
- Repeated peaks in the middle

## Language Notes

- Java implementation: [ContainerWithMostWater.java](ContainerWithMostWater.java)
- Python reinforcement: [container_with_most_water.ipynb](container_with_most_water.ipynb)

## Practice Goal

This is a standard two-pointer interview problem. Once this feels natural, move to prefix sums next.
