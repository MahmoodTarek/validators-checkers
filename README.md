# Sudoku Checker

This project provides a function that validates a 9x9 Sudoku board.

## Function Goal

The function checks if a given Sudoku board is valid or invalid.

A valid board must:
1. Not contain duplicate numbers in any row.
2. Not contain duplicate numbers in any column.
3. Not contain duplicate numbers in any 3x3 grid.

## Logic

For every cell in the board:
- If the cell is not empty:
  - Check if the number is already present in:
    - The same row.
    - The same column.
    - The same 3x3 grid.
- If a duplicate is found in any of these areas, the function returns **false**.
- If no duplicates are found after checking all cells, the function returns **true**.

    ![sudoku drawio](https://github.com/user-attachments/assets/1c7a0420-5dbe-4e82-89b1-35199792131b)

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
# IPv4 Checker

This project provides a function that validates if a given string is a valid IPv4 address.

## Function Goal

The function checks if a given string represents a valid IPv4 address.

A valid IPv4 address must:
1. Consist of four numeric segments separated by dots (`.`).
2. Each segment must be a number between 0 and 255 (inclusive).
3. Leading zeros in any segment are not allowed, except for the number `0` itself.
4. The address must contain exactly three dots (`.`) and no extra characters.

## Logic

For the given IPv4 address:

1. Split the address into four segments using the dot (`.`) as a separator.
2. If the number of segments is not equal to 4, return **false**.
3. For each segment:
   - Check if it contains only digits.
   - Check if its value is between 0 and 255.
   - Ensure it does not have leading zeros (e.g., "01", "001").
4. If all segments are valid, return **true**. Otherwise, return **false**.

  ![IPv4 drawio](https://github.com/user-attachments/assets/1798beda-a997-4d3f-a08c-41329ea28e65)

  
