CREATE SCHEMA IF NOT EXISTS `personal_website` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

USE mysql;
DELETE FROM user WHERE User='personal_website' AND Host='%';
FLUSH PRIVILEGES;
GRANT ALL PRIVILEGES ON personal_website.* TO 'personal_website'@'%' IDENTIFIED BY 'personal_website';
GRANT ALL PRIVILEGES ON personal_website.* TO 'personal_website'@'localhost' IDENTIFIED BY 'personal_website';
FLUSH PRIVILEGES;