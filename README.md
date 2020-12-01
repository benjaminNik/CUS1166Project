# Vehicular Cloud Real Time System
### for CUS 1166-Software Engineering
##### By: Aditya V., Andrew O., Benjamin N., Charnjot B., Michael M., Shiva G. (Group 3) <br/> <br/>


#### Milestone 1: Requirements Specification 
(taken from: https://docs.google.com/document/d/1neGHutoS9SDQq29_mAlbRED2GrWD_Al43ZQ2OgRHke8/edit?usp=sharing)
* Purpose - Vehicular Cloud Real-Time System (VCRTS) provides the basic services to manage/organize jobs and vehicles at a static vehicular cloud. In this system, Vehicles may arrive and depart with known and unknown schedules. Owners can rent out their vehicles to a Vehicular Cloud (VC) Manager. Clients can submit jobs in order to receive computation services.
* User Requirements:
  - Registration Service
  - Submission Service
  - Computation
  - Job Status
* Functional Requirements:
  - Registration Service 
  - Submission Service
  - Computation
  - Job Status
  - Role of VC Manager
  - Checkpoint Mechanism
  - Tracking the jobs
  - Confirmation Page
* Non-Funcional Requirements
  - Performance
  - Process Model
  - Language and Platform
  - Capacity
  - Data Integrity
  - Reliability <br/> <br/>

#### Milestone 2: GUI 
* Created a GUI through a java window using JFrame, Labels and Button objects.
* Main class controls input and output
* Main Frame contains GUI methods and reads user-input of Vehicle Owner information/Client Job information to .txt files for storage and later use

#### Milestone 3: Class design
UML Design: https://lucid.app/publicSegments/view/d98c9ae8-ba25-4c3c-83da-9cc8a983cc6e/image.pdf

#### Milestone 4: Class Implementation
* Added Classes in UML from Milestone 3:
  - Client
  - ClientList
  - Vehicle
  - VehicleOwner
  - VehicleOwnerList
  - Controller
  - VehicularCloud
  - Job
* Classes implemented to complete the following tasks:
  - Client can submit a job to VC and the information will be stored in a file. 
  - Vehicle Owner can register in the system and the information will be stored in a file.
  - VC Controller will be able to compute the completion time for each job.

#### Milestone 5: Client/Server Model
* Created server within Controller class
* Added a Task Owner (Client) to authorize Jobs stored.
* Added Vehicler Owner (Client) to authorized Vehicles stored. 
* Messages can be sent between Clients and Servers to authorize or reject information
