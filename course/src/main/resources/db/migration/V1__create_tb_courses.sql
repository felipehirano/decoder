CREATE TABLE tb_courses (
  course_id UUID PRIMARY KEY,
  name VARCHAR(150) NOT NULL,
  description VARCHAR(255) NOT NULL,
  creation_date TIMESTAMP NOT NULL,
  last_update_date TIMESTAMP NOT NULL,
  course_status VARCHAR(50) NOT NULL,
  course_level VARCHAR(50) NOT NULL,
  user_instructor UUID NOT NULL,
  image_url VARCHAR(255)
);
