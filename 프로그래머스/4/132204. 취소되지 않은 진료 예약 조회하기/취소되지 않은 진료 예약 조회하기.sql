-- 코드를 입력하세요
SELECT APNT_NO, PT_NAME, P.PT_NO, D.MCDP_CD, DR_NAME, APNT_YMD
FROM APPOINTMENT A
INNER JOIN PATIENT P ON P.PT_NO = A.PT_NO
INNER JOIN DOCTOR D ON A.MDDR_ID = D.DR_ID
WHERE SUBSTR(APNT_YMD, 1, 10) = '2022-04-13' AND APNT_CNCL_YN = 'N'
ORDER BY APNT_YMD;