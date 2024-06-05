-- 코드를 입력하세요
SELECT MEMBER_NAME, REVIEW_TEXT, SUBSTR(REVIEW_DATE, 1, 10) AS 'REVIEW_DATE' FROM
(SELECT M.MEMBER_NAME, M.MEMBER_ID, COUNT(*)
FROM MEMBER_PROFILE M
INNER JOIN REST_REVIEW R ON M.MEMBER_ID = R.MEMBER_ID
GROUP BY R.MEMBER_ID
ORDER BY COUNT(*) DESC
LIMIT 1) AS ta
INNER JOIN REST_REVIEW R ON ta.MEMBER_ID = R.MEMBER_ID
ORDER BY REVIEW_DATE ASC, REVIEW_TEXT ASC;