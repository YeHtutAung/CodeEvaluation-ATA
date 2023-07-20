CREATE TABLE `jobdata` (
  `id` int DEFAULT NULL,
  `Time_stamp` varchar(255) DEFAULT NULL,
  `Employer` varchar(255) DEFAULT NULL,
  `Location` varchar(255) DEFAULT NULL,
  `Job_Title` varchar(255) DEFAULT NULL,
  `Years_at_Employer` double DEFAULT NULL,
  `Years_of_Experience` double DEFAULT NULL,
  `Salary` double DEFAULT NULL,
  `Signing_Bonus` double DEFAULT NULL,
  `Annual_Bonus` double DEFAULT NULL,
  `Annual_Stock_Bonus` double DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Additional_Comments` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci