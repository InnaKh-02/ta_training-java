# Automated Testing for SauceDemo Login

**Website:** [SauceDemo](https://www.saucedemo.com/)

## Test Cases

### UC-1: Login with Empty Credentials
1. Enter any text into the "Username" and "Password" fields.
2. Clear both fields.
3. Click the "Login" button.
4. Verify the error message: **"Username is required"**.

### UC-2: Login with Only Username
1. Enter any text in the "Username" field.
2. Enter a password, then clear the "Password" field.
3. Click the "Login" button.
4. Verify the error message: **"Password is required"**.

### UC-3: Login with Valid Credentials
1. Enter an accepted username in the "Username" field.
2. Enter `"secret_sauce"` in the "Password" field.
3. Click the "Login" button.
4. Confirm the page title reads **"Swag Labs"** on the dashboard.

## Running Tests

To execute the tests from the command line:

- **Chrome:**
  ```shell
  mvn -Dbrowser=chrome -Dtest=LoginTest -Denvironment=qa clean test
- **Edge:**
  ```shell
  mvn -Dbrowser=edge -Dtest=LoginTest -Denvironment=qa clean test
