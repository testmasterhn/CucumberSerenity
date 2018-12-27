Feature: Login

  Scenario: Login in with wrong password
    Given the user is on the Login page
    When the user login in with right username and wrong password
    Then they should see the popup message "Tên đăng nhập hoặc Mật khẩu không đúng."
