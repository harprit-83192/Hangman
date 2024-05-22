# Hangman Game

This is a simple Hangman Game build with Java Spring boot. The project includes basic user authentication and game logic.
Users can register, start a new game and make guesses.

## Features
- User registration
- Start a new Hangman game
- Make guesses in Hangman game
- View the current game state

## Technologies Used
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database

## Installation
git clone https://github.com/harprit-83192/Hangman.git
cd Hangman
git checkout master

## Postman Collection
{
	"id": "4b806c2f-9391-4e20-9809-647248d1bc18",
	"name": "Hangman",
	"timestamp": "2024-05-22T05:52:37.779Z",
	"collection_id": "35099959-e9ba67ec-fc79-4feb-8d86-39fc10217430",
	"folder_id": 0,
	"environment_id": "0",
	"totalPass": 0,
	"delay": 0,
	"persist": true,
	"status": "finished",
	"startedAt": "2024-05-22T05:52:35.049Z",
	"totalFail": 0,
	"results": [
		{
			"id": "bba5b11b-2ed3-4658-8002-e55baa3d1940",
			"name": "localhost:8080/api/public/register",
			"url": "localhost:8080/api/public/register",
			"time": 483,
			"responseCode": {
				"code": 201,
				"name": "Created"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				483
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "41b51daa-1bef-485a-8778-25ac767ba53a",
			"name": "localhost:8080/api/game/start",
			"url": "localhost:8080/api/game/start",
			"time": 478,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				478
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "4691ccca-0e68-40f7-8dac-f33bd1365956",
			"name": "localhost:8080/api/game/2/guess?guess=c",
			"url": "localhost:8080/api/game/1/guess?guess=c",
			"time": 152,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				152
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "7ee5d97e-e63d-4c93-877c-91d10bf60740",
			"name": "localhost:8080/api/game/2/guess?guess=C",
			"url": "localhost:8080/api/game/1/guess?guess=C",
			"time": 102,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				102
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "8bc2f7df-52f8-4530-8a17-5574ade68cee",
			"name": "localhost:8080/api/game/2/guess?guess=r",
			"url": "localhost:8080/api/game/1/guess?guess=r",
			"time": 101,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				101
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "da921dff-b3e0-47ec-a1eb-db1909ba90f7",
			"name": "localhost:8080/api/game/2/guess?guess=a",
			"url": "localhost:8080/api/game/1/guess?guess=a",
			"time": 99,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				99
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "8c4f428e-10a5-45b5-9a69-cd83e8f5f27d",
			"name": "localhost:8080/api/game/2/guess?guess=t",
			"url": "localhost:8080/api/game/1/guess?guess=t",
			"time": 92,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				92
			],
			"allTests": [
				{}
			]
		}
	],
	"count": 1,
	"totalTime": 1507,
	"collection": {
		"requests": [
			{
				"id": "bba5b11b-2ed3-4658-8002-e55baa3d1940",
				"method": "POST"
			},
			{
				"id": "41b51daa-1bef-485a-8778-25ac767ba53a",
				"method": "POST"
			},
			{
				"id": "4691ccca-0e68-40f7-8dac-f33bd1365956",
				"method": "POST"
			},
			{
				"id": "7ee5d97e-e63d-4c93-877c-91d10bf60740",
				"method": "POST"
			},
			{
				"id": "8bc2f7df-52f8-4530-8a17-5574ade68cee",
				"method": "POST"
			},
			{
				"id": "da921dff-b3e0-47ec-a1eb-db1909ba90f7",
				"method": "POST"
			},
			{
				"id": "8c4f428e-10a5-45b5-9a69-cd83e8f5f27d",
				"method": "POST"
			}
		]
	}
}

