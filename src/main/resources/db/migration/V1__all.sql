CREATE TABLE user(
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(255),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100),
    role VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE event(
    event_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    event_type VARCHAR(255),
    event_date DATE,
    total_budget DECIMAL(10,2),
    location VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES user(user_id) ON DELETE CASCADE
);

CREATE TABLE category(
    category_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE vendor(
    vendor_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    company_name VARCHAR(255),
    bio VARCHAR(255),
    contact_number INT,
    FOREIGN KEY (user_id) REFERENCES user(user_id)
);

CREATE TABLE service(
    service_id INT AUTO_INCREMENT PRIMARY KEY,
    vendor_id INT,
    category_id INT,
    service_name VARCHAR(255),
    base_price DECIMAL(10,2),
    description VARCHAR(255),
    FOREIGN KEY (vendor_id) REFERENCES vendor(vendor_id) ON DELETE CASCADE,
    FOREIGN KEY (category_id) REFERENCES category(category_id) ON DELETE CASCADE
);

CREATE TABLE booking(
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    event_id INT,
    service_id INT,
    status VARCHAR(20),
    final_price DECIMAL(10,2),
    FOREIGN KEY (event_id) REFERENCES event(event_id) ON DELETE CASCADE,
    FOREIGN KEY (service_id) REFERENCES service(service_id) ON DELETE CASCADE
);

CREATE TABLE payment(
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT,
    amount DECIMAL(10,2),
    payment_method VARCHAR(255),
    status VARCHAR(20),
    transaction_date DATE DEFAULT (CURRENT_DATE)
);

CREATE TABLE sender(
    sender_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    phone INT
);

CREATE TABLE receiver(
    receiver_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    phone INT
);

CREATE TABLE message(
    message_id INT AUTO_INCREMENT PRIMARY KEY,
    sender_id INT,
    receiver_id INT,
    content TEXT,
    sent_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES sender(sender_id),
    FOREIGN KEY (receiver_id) REFERENCES receiver(receiver_id)
);


CREATE TABLE review(
    review_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    service_id INT,
    rating INT CHECK(rating BETWEEN 1 AND 5),
    comment TEXT,
    created_at DATE DEFAULT (CURRENT_DATE),
    FOREIGN KEY (user_id) REFERENCES user(user_id),
    FOREIGN KEY (service_id) REFERENCES service(service_id)
);

CREATE TABLE wishlist(
    wishlist_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    service_id INT,
    added_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES user(user_id),
    FOREIGN KEY (service_id) REFERENCES service(service_id)
);

ALTER TABLE payment
ADD CONSTRAINT fk_booking
FOREIGN KEY (booking_id) REFERENCES booking(booking_id) ON DELETE CASCADE;

CREATE TABLE booking_service(
    booking_service INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT,
    service_id INT,
    FOREIGN KEY (booking_id) REFERENCES booking(booking_id),
    FOREIGN KEY(service_id) REFERENCES service(service_id)
);
