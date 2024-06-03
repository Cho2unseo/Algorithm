-- 코드를 입력하세요
SELECT BOOK_ID, AUTHOR_NAME, SUBSTR(PUBLISHED_DATE, 1, 10) AS 'PUBLISHED_DATE'
FROM BOOK B
INNER JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE CATEGORY = '경제'
ORDER BY PUBLISHED_DATE;