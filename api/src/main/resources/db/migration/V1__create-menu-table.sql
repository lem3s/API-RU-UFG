CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE menu (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    date DATE UNIQUE NOT NULL
)