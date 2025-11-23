#### /api/public/info - *доступна всем без логина*

#### /api/account/balance - *доступ в баланс банковского счета только для USER*

#### /api/admin/users - *только для роли ADMIN*

#### /api/admin/stats - *только для ADMIN*

<br>

#### select username, password, enabled from users where username = ?

#### sselect username, authority from authorities where username = ?

### Authentication ---> SecurityContext

