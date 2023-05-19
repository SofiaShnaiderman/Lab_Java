--
-- PostgreSQL database dump
--

-- Dumped from database version 15.2
-- Dumped by pg_dump version 15.2

-- Started on 2023-05-19 19:28:44

SET
statement_timeout = 0;
SET
lock_timeout = 0;
SET
idle_in_transaction_session_timeout = 0;
SET
client_encoding = 'UTF8';
SET
standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET
check_function_bodies = false;
SET
xmloption = content;
SET
client_min_messages = warning;
SET
row_security = off;

SET
default_tablespace = '';

SET
default_table_access_method = heap;

--
-- TOC entry 197 (class 1175 OID 16752)
-- Name: student; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.student
(
    id             integer NOT NULL,
    surname        character varying(32),
    name           character varying(32),
    patronymic     character varying(32),
    "recordBookId" integer,
    birthday       date
);


ALTER TABLE public.student OWNER TO postgres;

--
-- TOC entry 3318 (class 0 OID 16398)
-- Dependencies: 215
-- Data for Name: student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.student (id, surname, name, patronymic, "recordBookId", birthday) FROM stdin;

1	Андрєєв Егор Сергійович	          280455	2003-01-30
2	Бачинський Станіслав Андрійович	  280454	2003-01-28
3	Брова Владислав Анатолійович	  280453	2002-02-22
4	Булай Іван Андрійович	          280452	2003-12-18
5	Ганзенко Дмитро Ігорович	      280451	2003-11-19
6	Головатий Вадим Сергійович	      280456	2003-09-14
7	Гринь Марія Романівна	          280457	2002-07-08
8	Дорошевич Ігор Іванович	          280458	2003-01-13
9	Заіка Максим Ігорович             280459	2003-10-12
10	Зайцев Олександр Дмитрович        280410	2002-06-11
11	Клименко Богдан Сергійович	      280411	2003-01-10
12	Кравченко Данило Іванович	      280412	2003-02-09
13	Мішунін Даниїл Русланович	      280413	2003-03-08
14	Обелець Дарія Сергіївна	          280414	2002-04-07
15	Ткачук Богдан Сергійович          280415	2003-08-06
16	Польща Микита Ігорович            280416	2002-11-05
17	Фоменко Владислав Олексанрович	  280417	2003-12-04
18  Сіда Юлія Анатоліївна	          280418	2003-09-03
19	Свідзінський Олександр Олегович	  280419	2003-04-02
20	Шнайдерман Софія Володимирівна    280420	2003-03-01
\.


--
-- TOC entry 3533 (class 2606 OID 16856)
-- Name: student recordBookId_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT "recordBookId_unique" UNIQUE ("recordBookId");


--
-- TOC entry 36741 (class 2606 OID 16911)
-- Name: student student_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);


-- Completed on 2023-05-19 21:11:41

--
-- PostgreSQL database dump complete
--

