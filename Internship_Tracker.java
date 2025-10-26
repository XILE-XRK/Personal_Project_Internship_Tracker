import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.concurrent.ThreadLocalRandom;
//Change access or something to private in order to maintain the privacy of the code 
class Internship_Tracker{
    public static void main(String[] args){
        ArrayList <String> usr_Info = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Pathway+");
        int EscPara = 0;
        while(EscPara == 0){
        System.out.println("\nAre you a returning user?(Yes/No):");
        String UsrResp = input.nextLine();
        String UsrName;
        String Pass_wrd;
        String Pass_wrd_Conf;
        int attempt = 0;
        UsrResp = UsrResp.toLowerCase();
        if(UsrResp.equals("yes")){
            System.out.println("Enter your usrname:");
            UsrName = input.nextLine();
            try(BufferedReader reader = new BufferedReader(new FileReader(UsrName))){
                System.out.printf("Welcome back %s,\nEnter your password:",UsrName);
                Pass_wrd = input.nextLine();
                reader.readLine();
                Pass_wrd_Conf = reader.readLine();
                while(attempt<=3){
                if(Pass_wrd == Pass_wrd_Conf){
                    System.out.printf("\n\nWelcome Back %s",UsrName);
                    attempt = 3;
                }
                else{
                    System.out.println("That password is incorrect please try again");
                    attempt++;
                    if(attempt==3){
                        System.out.println("Too many failed logins. Terminating");
                        System.exit(0);
                    }
                }
            }

            }
            catch(Exception e){
                System.err.println("Account doesn't exist.");
                System.exit(0);
            }
            EscPara++;
            //Continue account process from here. 
        }
        else if(UsrResp.equals("no")){
            System.out.println("Lets get an account started for you!");
            System.out.println("What username would you like to use?:");
            UsrName = input.nextLine();
            try{BufferedWriter file = new BufferedWriter(new FileWriter(UsrName));
                file.write(UsrName);
                file.write("\n");
                System.out.println("What is the password you would like to use?");
                Pass_wrd = input.nextLine();
                file.write(Pass_wrd);
                //You could utilize a randomization function in order to provide the user a 4 number code to enter to confirm the new account 
                file.close();
                System.out.println("Your account is now setup.\nRun program again with your account information.");
                input.close();
                System.exit(0);
            }
            catch(Exception e){
                System.err.println("File Failed to Open.");
                input.close();
                System.exit(0);
            }
            EscPara++;
        }
        else{
            System.out.println("Enter yes or no for you option choice:");
        }
    }
    input.close();
}
    //Continue coding here 
    public static String getInternship(int randomInt, String major, int year) {
	    String internship = "No internship";
	    switch (major) {

	    case "computer science":
            int min = 1;
            int max = 2;
	        switch (year) {
                case 1://year 1
                randomInt = 1;
                    switch(randomInt){
                        case 1:
                            internship = "\nIntro to Coding Internship:\n\nIntro to Coding Internship provides a crucial transition from theoretical knowledge to practical application in the software development world.\nThis temporary, hands-on role allows aspiring coders to work on real-world projects under the guidance of experienced developers, applying fundamental programming skills in a professional setting. Interns typically gain experience with industry-standard programming languages (like Python, Java, or JavaScript), version control tools such as Git, and collaborative development practices like Agile methodologies and code reviews. Beyond technical skills, a successful internship enhances crucial soft skills like problem-solving, critical thinking, communication, and time management.\nIt serves as an invaluable opportunity for mentorship, networking, and building a professional project portfolio, often acting as a direct recruitment pipeline for full-time roles, significantly boosting a new coder's confidence and career prospects.";
                            break;
                    }
                break;
                case 2://year 2
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                    switch(randomInt){
                        case 1:
                            internship = "\nSoftware Testing Internship:\n\nThe internship involves learning and executing various testing methodologies. Core responsibilities include reviewing requirements, designing test cases (both manual and automated), executing those tests, and meticulously logging defects in tracking systems like JIRA.\nInterns gain practical experience with essential testing tools (e.g., Selenium for automation) and develop a strong understanding of different testing types, such as functional testing, regression testing, and user acceptance testing (UAT). Beyond technical know-how, the role heavily cultivates attention to detail, critical thinking, and problem-solving abilities, as a tester must anticipate how a user might break the software.";
                        break;
                        case 2:
                            internship = "\nWeb Development Internship:\n\nWeb Development Internship is an entry-level position where interns contribute directly to the creation, modification, and maintenance of functional websites and web applications.\nThe core responsibility involves writing and reviewing code using foundational languages like HTML, CSS, and JavaScript, often under the guidance of a senior developer. Interns gain invaluable practical experience in front-end development, learning to implement responsive design to ensure sites work perfectly across all devices and building user interfaces with modern frameworks (such as React, Angular, or Vue.js). Depending on the role, they may also receive exposure to back-end tasks, including server-side logic, API development, and database management (using tools like SQL or MongoDB).\nBeyond coding, the intern learns professional best practices, including using Git for version control, participating in agile team ceremonies, debugging code, and effectively collaborating with designers and project managers.\nUltimately, this hands-on experience transforms theoretical knowledge into a highly marketable skill set, builds a crucial professional portfolio, and creates networking opportunities that are essential for launching a successful career in software or web development.";
                        break;
                        default:
                            System.err.println("\n\n\n\nError 308");
                    }
                break;
                case 3://year 3 
                    max = 7;
                    randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                    switch(randomInt){
                        case 1:
                          internship = "\nCybersecurity Internship:\n\nA Cybersecurity Internship provides students and recent graduates with essential, hands-on experience in defending an organization's systems, networks, and data against real-world threats.\nIntern responsibilities are diverse and focused on the core areas of security operations, including assisting the security team with vulnerability assessments, conducting penetration testing exercises, and monitoring security tools like SIEM (Security Information and Event Management) systems to detect and respond to suspicious activity.\nThey are frequently involved in incident response, helping to analyze security events, trace the origin of a threat, and implement mitigation strategies. The experience is invaluable for developing a practical command of technical skills like network security configuration, forensic analysis, and scripting (often in Python) for automation.\nCrucially, a cybersecurity internship allows the individual to build a strong professional network, gain exposure to industry compliance standards (like NIST or ISO 27001), and develop essential soft skills like critical thinking, communication, and meticulous attention to detail, which are all vital for a successful and evolving career in the field.";  
                        break;
                        case 2:
                            internship = "\nAI Research Internship:\n\nAn AI Research Internship is a highly specialized role focused on contributing to the cutting-edge development of machine learning, deep learning, and artificial intelligence models.\nInterns work alongside senior researchers, typically on projects involving novel algorithms, advanced data processing, or the application of AI to solve complex, often theoretical, problems in areas like Natural Language Processing (NLP), Computer Vision, or Reinforcement Learning. Key responsibilities involve conducting extensive literature reviews, designing and executing experiments, preprocessing and analyzing large datasets, and implementing models using frameworks such as PyTorch or TensorFlow with a strong foundation in Python.\nThis internship is crucial for developing rigorous research methodology, deepening expertise in statistical analysis, and learning the process of documenting and publishing results, offering a direct pathway toward careers in AI research, academia, or advanced data science.";
                            break;
                        
                        case 3:
                            internship = "\nMobile App Development Internship:\n\nAn Mobile App Development Internship provides hands-on experience in building and optimizing applications for platforms like iOS and Android. The intern works closely with a development team, contributing directly to the design, coding, testing, and maintenance of features in a production mobile application.\nCore responsibilities include writing native code using languages like Swift/Kotlin or cross-platform code using frameworks like React Native or Flutter, and ensuring the app delivers a seamless user experience (UX) across various devices and screen sizes.\nInterns gain practical exposure to integrating APIs, managing local data storage, utilizing version control (Git), and engaging in the debugging and quality assurance (QA) processes essential for a public-facing application.\nUltimately, this internship accelerates the development of a specialized portfolio and provides a real-world understanding of the mobile application lifecycle, from conception through deployment to the App Store or Google Play.";
                            break;
                        case 4:
                            internship = "\nGame Development Internship:\n\nA Game Development Internship is a creative and technical position focused on contributing to the production of video games across various platforms (PC, console, or mobile).\nInterns are integrated into a multi-disciplinary team, working directly on a live project under the guidance of senior designers and engineers.\nKey responsibilities include implementing gameplay features using languages like C++ or C#, scripting game logic, building and iterating on levels, and debugging systems within industry-standard engines such as Unity or Unreal Engine.\nThe experience is vital for mastering the complete game development pipeline, gaining proficiency in version control (Git/Perforce), collaborating effectively with artists and designers, and translating abstract game design concepts into polished, functional, and engaging player experiences.";
                            break;
                        case 5:
                            internship = "\nData Science Internship:\n\nA Data Science Internship offers a practical, business-focused experience where the intern applies statistical methods and computational techniques to extract actionable insights from large, complex datasets.\nThe intern's primary goal is to support the data science team by contributing to the entire analytical lifecycle, from data collection and cleaning to model deployment.\nCore responsibilities involve using tools like Python (with libraries such as Pandas and scikit-learn) or R to perform Exploratory Data Analysis (EDA), developing predictive machine learning models, and utilizing SQL for data querying.\nA critical component is communicating complex findings through clear data visualizations (e.g., Tableau or Power BI) and comprehensive reports, enabling non-technical stakeholders to make data-driven decisions that impact the company's products or strategy.";
                            break;
                        case 6:
                            internship = "\nCloud Computing Internship:\n\nA Cloud Computing Internship is a hands-on technical role that provides experience with the architecture, deployment, management, and automation of services on leading cloud platforms like AWS, Microsoft Azure, or Google Cloud Platform (GCP)\\n" + 
                                                                "Interns primarily focus on helping a company leverage the scale, security, and flexibility of these technologies to solve real-world business challenges\\n" + 
                                                                "Core responsibilities involve assisting with the provisioning and maintenance of cloud resources such as Virtual Machines, storage, and networking components\\n" + 
                                                                "The intern is often tasked with writing and refining Python, Bash, or PowerShell scripts to automate repetitive operational tasks, a practice central to DevOps and Infrastructure as Code (IaC)\\n" + 
                                                                "Additionally, you'll support the deployment and monitoring of cloud-native applications, often involving tools like Docker and Kubernetes for containerization, and assist in cloud migration or optimization projects\\n" + 
                                                                "This role is crucial for developing practical skills in cloud security (IAM), troubleshooting, and performance monitoring, all while collaborating with experienced cloud engineers.";
                        break;
                        case 7:
                            internship = "\nEmbedded Systems Internship:\n\nAn Embedded Systems Internship is a highly technical role that bridges the gap between software programming and electrical engineering, focusing on the development of specialized computing systems found in devices like IoT sensors, medical equipment, and automotive control units\\n" + 
                                                                "Interns primarily focus on writing, testing, and debugging firmware for microcontrollers and microprocessors, often using the C/C++ programming languages to ensure the code is efficient and works within strict memory and performance limits\\n" + 
                                                                "Key responsibilities include assisting with hardware-software integration, which involves configuring device drivers and working with low-level hardware interfaces and communication protocols like I2C, SPI, and UART\\n" + 
                                                                "You will gain hands-on experience using specialized debugging tools such as oscilloscopes and logic analyzers, and may work with a Real-Time Operating System (RTOS) to manage time-critical system tasks\\n" + 
                                                                "This internship provides invaluable skills in real-time programming, data sheet analysis, and low-level hardware interaction, which are essential for a career in embedded software or hardware design.";
                        break;
                    }
                    case 4://year 4
                        max = 10;
                        randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                        switch(randomInt){
                        case 1:
                          internship = "\nSoftware Engineer Internship:\n\nA Software Engineer Internship is a critical, hands-on role where you apply fundamental Computer Science principles to the development, maintenance, and testing of production-level software applications.\nInterns are integrated into an Agile or Scrum team and contribute directly to the codebase, often working on a specific feature, component, or bug fix under the mentorship of a Senior Engineer Core responsibilities include writing clean, scalable, and well-documented code using languages like Python, Java, JavaScript, or C++, and actively participating in code reviews to maintain quality and learn best practices.\nYou will be responsible for utilizing Git or similar version control systems to manage changes, performing comprehensive unit and integration testing, and leveraging your knowledge of algorithms and data structures to solve real-world problems.\nThis experience is essential for developing proficiency in the full Software Development Life Cycle (SDLC), working with CI/CD pipelines, and gaining exposure to areas like cloud services (AWS/Azure/GCP) and database management (SQL/NoSQL).";  
                        break;
                        case 2:
                            internship = "\nBackend Developer Internship:\n\nA Backend Developer Internship is a specialized role focused on building, maintaining, and scaling the server-side logic and infrastructure that powers web and mobile applications.\nInterns are typically responsible for writing robust, high-performance code in languages like Python, Java, Node.js, or Go to implement core business logic and create RESTful or GraphQL APIs.\nA major component of the job involves working extensively with databases, including designing schemas, writing optimized queries in SQL (e.g., PostgreSQL, MySQL), or managing NoSQL stores (e.g., MongoDB).\nCore responsibilities also include integrating third-party services, ensuring application security, and optimizing the application for speed and scalability.\nInterns gain practical experience with cloud platforms (AWS, Azure, GCP), version control with Git, and containerization tools like Docker as they work within an Agile/Scrum team structure.\nThis role is crucial for developing expertise in system architecture, performance tuning, and the reliable delivery of data to the frontend.";
                            break;
                        case 3:
                            internship = "\nFrontend Developer Internship:\n\nA Frontend Developer Internship is a creative and technical role focused on building the user-facing side of websites and applications, ensuring they are responsive, accessible, and highly engaging.\nInterns focus on implementing visual and interactive elements using the core triad of web development: HTML, CSS, and JavaScript. They are expected to gain proficiency with modern frontend frameworks and libraries like React, Angular, or Vue.js to manage component-based architecture and application state. Core responsibilities include translating UI/UX designs (often from Figma or Sketch) into clean, semantic code, participating in cross-browser compatibility testing, and ensuring optimal page load performance.\nThis role is essential for developing expertise in responsive design, client-side performance optimization, state management, and effective collaboration with both backend engineers and design teams.";
                            break;
                        case 4:
                            internship = "\nFull Stack Developer Internship:\n\nA Full Stack Developer Internship is a comprehensive technical role that provides experience across the entire spectrum of web application development, from the user interface to the core server logic.\nInterns work on both the frontend, utilizing technologies like React, Angular, or Vue.js along with HTML, CSS, and JavaScript, and the backend, using server-side languages such as Python, Node.js, or Java. Key responsibilities include designing and developing new features end-to-end, which involves creating and managing APIs, designing and interacting with SQL or NoSQL databases, and building responsive user interfaces.\nThis role is crucial for gaining broad experience in the Software Development Life Cycle (SDLC), understanding how the frontend and backend interact, and becoming proficient in deployment tools, cloud services, and version control systems like Git.";
                            break;
                        case 5:
                            internship = "\nDevOps Engineer Internship:\n\nA DevOps Engineer Internship is a highly collaborative role focused on streamlining the software development lifecycle from coding and deployment to maintenance and operations.\nInterns gain practical experience with automation—the core principle of DevOps—by writing scripts using languages like Python, Bash, or Groovy to automate repetitive tasks and build processes.\nKey responsibilities include assisting with the setup and maintenance of Continuous Integration/Continuous Deployment (CI/CD) pipelines using tools such as Jenkins, GitLab CI, or GitHub Actions.\nYou will also work with Infrastructure as Code (IaC) tools like Terraform or Ansible to provision and manage cloud resources (e.g., AWS, Azure, or GCP), and gain essential experience with containerization technologies, primarily Docker and Kubernetes, for packaging and deploying applications.\nThis internship is crucial for developing skills in system monitoring, log management, and ensuring the reliability and scalability of production environments.";
                            break;
                        case 6:
                            internship = "\nMachine Learning Engineer Internship\n\nA Machine Learning (ML) Engineer Internship is a specialized role focused on applying scientific methods and programming skills to build, train, and deploy intelligent models into production systems.\nInterns primarily work with data pipelines, using languages like Python and its specialized libraries (TensorFlow, PyTorch, Scikit-learn) to clean, process, and engineer features from large datasets.\nKey responsibilities include designing experiments, training and evaluating various ML models (e.g., deep learning, classic algorithms), and optimizing model performance, efficiency, and scalability.\nThis role is crucial for gaining experience with the entire ML lifecycle (MLOps), including versioning models, deploying them via APIs, and setting up monitoring systems to ensure continuous performance and drift detection in a production environment.";
                        break;
                        case 7:
                            internship = "\nDatabase Administrator Internship\n\nA Database Administrator (DBA) Internship is a practical role focused on the installation, configuration, maintenance, and performance of a company's database systems, such as MySQL, PostgreSQL, Oracle, or SQL Server.\nInterns assist with core operational tasks, including monitoring database health, ensuring data integrity, and conducting regular backups and recovery tests to guarantee business continuity.\nKey responsibilities often involve writing and optimizing complex SQL queries and stored procedures to improve application performance, managing user access and permissions for security, and participating in database patching or migration projects.\nThis internship is essential for developing expertise in data modeling, performance tuning, security protocols, and managing the lifecycle of enterprise data.";
                        break;
                        case 8:
                            internship = "\nSystems Analyst Internship\n\nA Systems Analyst Internship is a critical, hybrid role that bridges the gap between a business's operational needs and its technological capabilities, focusing on analyzing, designing, and improving organizational systems.\nInterns primarily focus on requirements gathering by interviewing stakeholders, documenting current processes, and identifying opportunities for system enhancements or replacements.\nKey responsibilities include creating detailed functional and technical specifications, modeling business processes (often using tools like flowcharts or UML diagrams), and assisting with the testing and implementation of new software solutions.\nThis role is essential for developing expertise in business process analysis, translating non-technical needs into technical requirements, and ensuring that technology solutions effectively solve organizational problems and drive strategic value.";
                        break;
                        case 9:
                            internship = "\nCloud Infrastructure Internship\n\nA Cloud Infrastructure Internship is a specialized technical role focused on the design, deployment, configuration, and management of the fundamental compute, networking, and storage services on major cloud providers like AWS, Microsoft Azure, or Google Cloud Platform (GCP).\nInterns work directly with the foundational building blocks of the cloud, focusing on the stability and scalability of the environment.\nKey responsibilities include deploying and managing virtual machines (EC2 instances, etc.), configuring virtual networks and subnets, and managing scalable storage solutions (S3, Azure Blob Storage).\nYou will gain critical experience with Infrastructure as Code (IaC) tools, such as Terraform or CloudFormation, to automate resource provisioning, and assist with monitoring system health, managing access controls (IAM), and implementing basic security best practices.\nThis internship is essential for developing expertise in cloud architecture principles, core networking concepts, and robust automation practices necessary for maintaining large-scale cloud environments.";
                            break;
                        case 10:
                            internship = "\nAI/ML Research Internship\n\nA AI/ML Research Internship is a highly analytical and technical role focused on exploring cutting-edge theories and developing novel models to solve complex, open-ended problems, often with the goal of publication or product innovation.\nInterns work under the guidance of research scientists to investigate new machine learning algorithms or techniques, particularly in areas like Deep Learning, Natural Language Processing (NLP), or Computer Vision. Key responsibilities involve conducting extensive literature reviews, designing and performing controlled experiments, manipulating massive datasets, and rigorously evaluating the performance of models.\nThis role is crucial for developing expertise in mathematical modeling, statistical rigor, data analysis (often using Python and Jupyter notebooks), and communicating complex findings through comprehensive reports and presentations.";
                        break;
                        default:
                            System.err.println("Major error 354");
                        }
                    break;//final breakout for CS next line is ME
	        }
	    break;

	    case "mechanical engineering":
        min = 1;
        max = 1;
            switch(year){
                case 1://year 1
                max = 1;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                break;            
                case 2://year 2
                max = 2;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 3:
                max = 7;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 4:
                max = 10;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
            }
            break;
	    case "civil engineering":
        min = 1;
        max = 1;
            switch(year){
                case 1://year 1
                max = 1;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);    
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }               
                case 2://year 2
                max = 2;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 3:
                max = 7;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 4:
                max = 10;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
            }

	        break;

	    case "biomedical engineering":
        min = 1;
        max = 1;
            switch(year){
                case 1://year 1
                max = 1;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);    
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }               
                case 2://year 2
                max = 2;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 3:
                max = 7;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 4:
                max = 10;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
            }
	        break;

	    case "aerospace engineering":
        min = 1;
        max = 1;
            switch(year){
                case 1://year 1
                max = 1;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);    
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }                
                case 2://year 2
                max = 2;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 3:
                max = 7;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 4:
                max = 10;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
            }

	        break;

	    case "electrical engineering":
        min = 1;
        max = 1;
            switch(year){
                case 1://year 1
                max = 1;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);    
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }                
                case 2://year 2
                max = 2;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 3:
                max = 7;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 4:
                max = 10;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
            }
            break;
        case "biology":
        min = 1;
        max = 1;
            switch(year){
                case 1://year 1
                max = 1;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);    
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }                
                case 2://year 2
                max = 2;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 3://year 3
                max = 7;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
                case 4://year 4
                max = 10;
                randomInt = ThreadLocalRandom.current().nextInt(min,max+1);
                switch(randomInt){
                    case 1:
                        internship = "";
                        break;
                }    
            }
	        break;
	    default:
	        System.out.printf("\n\nInternship positions for %s major are currently unavaliable",major);
	        break;
	}

	    return internship;
	}
    
    }
    
