# AngularJS Calculator Application - Lab Experiment No: 3

## Aim
Develop a simple AngularJS calculator application that can perform basic mathematical operations (addition, subtraction, multiplication, division) based on user input.

## Introduction
In this lab experiment, the goal is to create a straightforward AngularJS calculator application capable of handling basic mathematical operations such as addition, subtraction, multiplication, and division. The application will perform calculations based on user input.

## Directives Used

### 1. `ng-switch`
The `ng-switch` directive allows the hiding or showing of HTML elements based on a specified expression. Child elements with the `ng-switch-when` directive will be displayed if they match a certain value, and the `ng-switch-default` directive defines a default section to be displayed if none of the other sections match.

#### Syntax:
```html
<element ng-switch="expression">
  <element ng-switch-when="value"></element>
  <element ng-switch-when="value"></element>
  <element ng-switch-when="value"></element>
  <element ng-switch-default></element>
</element>

Parameter Explanation:
+   expression: Specifies an expression that will remove elements with no match and display elements with a match.

## Output