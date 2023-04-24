insert into user(username,password) values ('jack', 'pass_word'),('bob', 'pass_word'),('apple', 'pass_word'),('glaxo', 'pass_word');
insert into role(role_name) values  ('CONSUMER'),('SELLER');
insert into user_roles(USER_USER_ID  ,	ROLES_ROLE_ID  ) values(1, 1),(2, 1),(3, 2),(4, 2);
insert into category(category_name) values ('Fashion'),('Electronics'),('Books'),('Groceries'),('Medicines');
INSERT into PRODUCT(PRICE ,PRODUCT_NAME ,CATEGORY_CATEGORY_ID,SELLER_USER_ID  ) values  (29190, 'Apple iPad 10.2 8th Gen WiFi iOS Tablet', 2, 3), (10, 'Crocin pain relief tablet', 5, 4);
insert into cart(total_amount,USER_USER_ID) values (20, 1),(0, 2);
insert into cart_product(PRODUCT_PRODUCT_ID,quantity) values (2,2);
insert into CART_CART_PRODUCTS(CART_CART_ID,CART_PRODUCTS_CP_ID) values (1, 1);

