CREATE TABLE Cookie
(
    cid          INT PRIMARY KEY,
    manufacturer VARCHAR(255) NOT NULL,
    cookiename   VARCHAR(255) NOT NULL,
    rating       CHAR(5)      NOT NULL,
    CONSTRAINT ck_ck_rating CHECK (rating IN ('*', '**', '***', '****', '*****'))
);

