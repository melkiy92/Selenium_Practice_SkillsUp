Story: verify tutor's positions

Scenario: verify Yakovenko's position
Given open our team page
When page contains tutors
Then verify that position for Павел Яковенко is тренер, автор курса

Scenario: verify Melnik's position
Given open our team page
When page contains tutors
Then verify that position for Дарья Мельник is преподаватель английского

Scenario: verify Simchak's position
Given open our team page
When page contains tutors
Then verify that position for Ольга Симчак is тренер, PSPO, PSM

Scenario: verify Siniaieva is Java tutor
Given open main page
When navigate training -> courses -> divingIntoJava
Then tutor Оксана Синяева is shown on the page

Scenario: verify Pedorenko is Java tutor
Given open main page
When navigate training -> courses -> divingIntoJava
Then tutor Алексей Педоренко is shown on the page

Scenario: verify Guzichenko is Java tutor
Given open main page
When navigate training -> courses -> divingIntoJava
Then tutor Артем Гузиченко is shown on the page
