USE encuesta;

INSERT INTO `encuesta`.`rol` (`RolNombre`) VALUES ('ROLE_ADMIN');
INSERT INTO `encuesta`.`rol` (`RolNombre`) VALUES ('ROLE_USER');

INSERT INTO `encuesta`.`usuario` (`Username`) VALUES ('useradmin');
INSERT INTO `encuesta`.`usuario` (`Username`) VALUES ('useruser');

INSERT INTO `encuesta`.`usuario_has_rol` (`rol_RolID`, `Usuario_UsuarioID`) VALUES ('1', '1');
INSERT INTO `encuesta`.`usuario_has_rol` (`rol_RolID`, `Usuario_UsuarioID`) VALUES ('2', '2');

INSERT INTO `encuesta`.`survey` (`SurveyName`,`SurveyActive`,`AllowMultipleApplications`) VALUES ('encuesta1',1,0);
INSERT INTO `encuesta`.`survey` (`SurveyName`,`SurveyActive`,`AllowMultipleApplications`) VALUES ('encuesta2',1,0);

INSERT INTO `encuesta`.`category` (`CategoryName`, `survey_SurveyID`) VALUES ('cat1', '1');

INSERT INTO `encuesta`.`surveyparticipant` (`survey_SurveyID`, `Usuario_UsuarioID`) VALUES ('1', '2');
INSERT INTO `encuesta`.`surveyparticipant` (`survey_SurveyID`, `Usuario_UsuarioID`) VALUES ('1', '1');

INSERT INTO `encuesta`.`questiontype` (`QuestionTypeCode`, `QuestionTypeHasChoices`, `QuestionTypeName`) VALUES ('RANK', 1, 'ranking');

INSERT INTO `encuesta`.`question` (`QuestionAnswerRequired`, `QuestionName`, `QuestionNumber`, `QuestionText`, `questiontype_QuestionTypeCode`,  `category_CategoryID`) VALUES (1, 'como te ', 1, 'descripcion de pregunta', 'rank', 1);
INSERT INTO `encuesta`.`question` (`QuestionID`, `QuestionAnswerRequired`, `QuestionName`, `QuestionNumber`, `QuestionText`, `category_CategoryID`, `questiontype_QuestionTypeCode`) VALUES (2, 1, 'asda', 1, 'asdasd', 1, 'rank');

INSERT INTO `encuesta`.`segmentation` (`segmentationName`, `survey_SurveyID`) VALUES ('genero',1);
INSERT INTO `encuesta`.`segmentation` (`segmentationName`, `survey_SurveyID`) VALUES ('localidad',1);

INSERT INTO `encuesta`.`segmentationitem` (`segmentationitemName`, `segmentation_segmentationID`) VALUES ('hombre', '1');
INSERT INTO `encuesta`.`segmentationitem` (`segmentationitemName`, `segmentation_segmentationID`) VALUES ('mujer', '1');

INSERT INTO `encuesta`.`segmentationitem` (`segmentationitemName`, `segmentation_segmentationID`) VALUES ('cdmx', '2');
INSERT INTO `encuesta`.`segmentationitem` (`segmentationitemName`, `segmentation_segmentationID`) VALUES ('edomex', '2');

UPDATE `encuesta`.`usuario` SET `Password` = '$2a$10$aisvb/w8kIr28jUZmUHk5.N6weP1PLlRknZGfJ7TWCepwEJDOUtN6' WHERE (`UsuarioID` = '2');
UPDATE `encuesta`.`usuario` SET `Password` = '$2a$10$aisvb/w8kIr28jUZmUHk5.N6weP1PLlRknZGfJ7TWCepwEJDOUtN6' WHERE (`UsuarioID` = '1');

