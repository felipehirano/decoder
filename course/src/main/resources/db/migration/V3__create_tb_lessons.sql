CREATE TABLE tb_lessons (
  lesson_id UUID PRIMARY KEY,
  title VARCHAR(150) NOT NULL,
  description VARCHAR(255) NOT NULL,
  video_url VARCHAR(255) NOT NULL,
  creation_date TIMESTAMP NOT NULL,
  last_update_date TIMESTAMP NOT NULL
);