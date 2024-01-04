INSERT INTO car (license_plate, repair_date , customer_name           , catalogs         , car_maker)
VALUES          ('29V-653.66' , '2003-11-16', 'Nguyễn Ngọc Minh Trang', 'Bảo dưỡng lần 1', 'Honda'  ),
                ('29H-158.40' , '2023-05-19', 'Lê Bảo Bình'           , 'Bảo dưỡng lần 8', 'VinFast'),
                ('29E-888.88' , '2019-04-07', 'Nguyễn Thị Thái Hà'    , 'Bảo dưỡng lần 2', 'Porsche'),
                ('29H-689.12' , '2025-01-29', 'Vũ Đức Long'           , 'Bảo dưỡng lần 7', 'Nissan' ),
                ('20B-643.83' , '2006-05-29', 'Vũ Anh Đoán'           , 'Bảo dưỡng lần 3', 'Ferrari'),
                ('14B-676.66' , '2018-03-29', 'Nguyễn Thị Hương'      , 'Bảo dưỡng lần 4', 'Porsche'),
                ('90B-546.03' , '2029-11-29', 'Hoàng Đạo Tĩnh'        , 'Bảo dưỡng lần 8', 'Toyota' ),
                ('99A-216.65' , '2002-05-29', 'Phạm Tiến Anh'         , 'Bảo dưỡng lần 1', 'Nissan' ),
                ('49A-516.25' , '2002-05-29', 'Nguyễn Ngọc Anh'       , 'Bảo dưỡng lần 6', 'Audi'   ),
                ('11A-206.57' , '2022-07-21', 'Phạm Văn Hệ'           , 'Bảo dưỡng lần 3', 'VinFast'),
                ('80E-901.37' , '2021-03-05', 'Nguyễn Văn Khoa'       , 'Bảo dưỡng lần 9', 'Toyota' );

INSERT INTO accessory (license_plate, repair_date , name         , price  , status_damaged, repair_status)
VALUES                ('11A-206.57' , '2022-07-21', 'Cần gạt mưa', 999000 , 'Bị gãy'      , 'Thay mới'   ),
                      ('14B-676.66' , '2018-03-29', 'Lọc gió'    , 199000 , 'Bị bụi bẩn'  , 'Làm sạch'   ),
                      ('20B-643.83' , '2006-05-29', 'Lốp xe'     , 2000000, 'Bị thủng'    , 'Thay lốp'   ),
                      ('49A-516.25' , '2002-05-29', 'Bình ắc quy', 1465000, 'Bị hết điện' , 'Sạc điện'   ),
                      ('80E-901.37' , '2021-03-05', 'Đèn xe'     , 369000 , 'Bị vỡ'       , 'Thay đèn'   );