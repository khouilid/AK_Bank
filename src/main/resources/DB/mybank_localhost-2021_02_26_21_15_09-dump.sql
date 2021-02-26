--
-- PostgreSQL database dump
--

-- Dumped from database version 12.6 (Ubuntu 12.6-0ubuntu0.20.10.1)
-- Dumped by pg_dump version 12.6 (Ubuntu 12.6-0ubuntu0.20.10.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: postgres; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';


ALTER DATABASE postgres OWNER TO postgres;

\connect postgres

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: DATABASE postgres; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: playground; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.playground (
    equip_id integer NOT NULL,
    type character varying(50) NOT NULL,
    color character varying(25) NOT NULL,
    location character varying(25),
    install_date date,
    CONSTRAINT playground_location_check CHECK (((location)::text = ANY ((ARRAY['north'::character varying, 'south'::character varying, 'west'::character varying, 'east'::character varying, 'northeast'::character varying, 'southeast'::character varying, 'southwest'::character varying, 'northwest'::character varying])::text[])))
);


ALTER TABLE public.playground OWNER TO postgres;

--
-- Name: playground_equip_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.playground_equip_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.playground_equip_id_seq OWNER TO postgres;

--
-- Name: playground_equip_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.playground_equip_id_seq OWNED BY public.playground.equip_id;


--
-- Name: playground equip_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.playground ALTER COLUMN equip_id SET DEFAULT nextval('public.playground_equip_id_seq'::regclass);


--
-- Data for Name: playground; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.playground (equip_id, type, color, location, install_date) FROM stdin;
2	swing	yellow	northwest	2018-08-16
1	slide	green	south	2017-04-28
3	slide	blue	south	2017-04-28
6	slide	blue	south	2017-04-28
\.


--
-- Name: playground_equip_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.playground_equip_id_seq', 6, true);


--
-- Name: playground playground_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.playground
    ADD CONSTRAINT playground_pkey PRIMARY KEY (equip_id);


--
-- PostgreSQL database dump complete
--

