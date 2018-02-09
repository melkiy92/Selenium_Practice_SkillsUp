Story: verify Java tutors

Scenario: verify Yakovenko's position
Given open http://skillsup.ua/about/our-team/
When tutor Павел Яковенко is found
Then verify that position for Павел Яковенко is тренер, автор курса

Scenario: verify Melnik's position
Given open http://skillsup.ua/about/our-team/
When tutor Дарья Мельник is found
Then verify that position for Дарья Мельник is преподаватель английского

Scenario: verify Simchak's position
Given open http://skillsup.ua/about/our-team/
When tutor Ольга Симчак is found
Then verify that position for Ольга Симчак is тренер, PSPO, PSM