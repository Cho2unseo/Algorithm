WITH abc
AS
(SELECT FISH_TYPE, ID, IFNULL(LENGTH, 10) AS LENGTH FROM FISH_INFO)

SELECT COUNT(*) AS 'FISH_COUNT', MAX(LENGTH) AS 'MAX_LENGTH', FISH_TYPE FROM abc GROUP BY FISH_TYPE HAVING AVG(LENGTH) >= 33 ORDER BY FISH_TYPE;