MYSQL增删查改
1）
//单行插入
INSERT INTO student VALUES(10,'白骨精',78,34,67);
//指定插入
INSERT INTO student (id,name,matn) VALUES (14,'刘三',80);


2)
DELETE from exam_result where id = 8;

CREATE TABLE for_delete(
id INT,
name VARCHAR(20)
);
INSERT INTO for_delete VALUES('A'),('B'),('C');
 
 DELETE from for_delete;
3)
CREATE TABLE exam_result (
id INT,
name VARCHAR(20),
chinese DECIMAL(3,1),
math DECIMAL(3,1),
english DECIMAL(3,1)
);

INSERT INTO exam_result VALUES(1,'李一',78,49,90);
INSERT INTO exam_result VALUES(2,'李二',59,98,76);
INSERT INTO exam_result VALUES(3,'李三',79,67,80);
INSERT INTO exam_result VALUES(4,'李四',58,39,60);
INSERT INTO exam_result VALUES(5,'李五',89,45,98);
INSERT INTO exam_result VALUES(6,'李六',78,94,90);

//全列查询
SELECT * FROM exam_result;
//指定列查询
SELECT id,name,english from exam_result;
//查询字段为表达式
SELECT id,name,math+10,chinese from exam_result;
SELECT id,name,math+10,chinese+math +english from exam_result;
//去重DISTINCT
SELECT DISTINCT english from exam_result;
//排序
SELECT name,math from exam_result ORDER BY math;
SELECT name,math + chinese + english total from exam_result ORDER BY total;
//条件查询
SELECT name,english from exam_result where english < 60;
SELECT name,chinese,english from exam_result where chinese < english;
SELECT name,chinese+english+math total FROM exam_result WHERE chinese+english+math < 200;
SELECT name,chinese+english+math total FROM exam_result WHERE chinese+english+math < 200;

SELECT * FROM exam_result WHERE chinese > 80 or math > 34 and english > 79;

SELECT name,math from exam_result where math IN(78,45,70,80);
//模糊查询LIKE
SELECT name from exam_result where name LIKE '李%';
SELECT name from exam_result where name LIKE '刘__';
//分页查询LIMIT
SELECT name,math + chinese + english total from exam_result ORDER BY total limit 3;
SELECT name,math + chinese + english total from exam_result ORDER BY total limit 3,6;
SELECT name,math + chinese + english total from exam_result ORDER BY total desc limit 6 offset 3;

//按ID进行分页
SELECT id,name,math , chinese , english from exam_result ORDER BY id limit 3 offset 0;
SELECT id,name,math , chinese , english from exam_result ORDER BY id limit 6 offset 3;
SELECT id,name,math , chinese , english from exam_result ORDER BY id limit 3 offset 6;

4)UPDATE ... SET ...
UPDATE exam_result SET math = 80 WHERE NAME = '李二';
UPDATE exam_result SET math = 60, chinese = 70 WHERE name = '李四';

UPDATE exam_result SET math = math + 30 ORDER BY chinese+math+english limit 3;




























