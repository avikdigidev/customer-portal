-- Table: example.customer

-- DROP TABLE IF EXISTS example.customer;

CREATE TABLE IF NOT EXISTS example.customer
(
    customer_id text NOT NULL,
    first_name text,
    last_name text,
    email_id text,
    phone_number bigint,
    creation_date text,
    CONSTRAINT customer_pkey PRIMARY KEY (customer_id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS example.customer
    OWNER to postgres;

-- Table: example.subscription

-- DROP TABLE IF EXISTS example.subscription;

CREATE TABLE IF NOT EXISTS example.subscription
(
    subscription_id text NOT NULL,
    customer_id text,
    subscription_on_date date,
    subscription_off_date date,
    balance_pending bigint,
    CONSTRAINT subscription_pkey PRIMARY KEY (subscription_id),
    CONSTRAINT customer_id FOREIGN KEY (customer_id)
    REFERENCES example.customer (customer_id) MATCH SIMPLE

    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS example.subscription
    OWNER to postgres;

-- Table: example.address

-- DROP TABLE IF EXISTS example.address;

CREATE TABLE IF NOT EXISTS example.address
(
    address_id text NOT NULL,
  customer_id text,
  address1 text,
  address2 text,
  state text,
  postal_code text,
  last_update_date date,
  CONSTRAINT address_pkey PRIMARY KEY (address_id),
  CONSTRAINT customer_id FOREIGN KEY (customer_id)
  REFERENCES example.customer (customer_id) MATCH SIMPLE

  )

  TABLESPACE pg_default;

ALTER TABLE IF EXISTS example.address
  OWNER to postgres;