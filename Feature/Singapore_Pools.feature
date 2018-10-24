Feature: Betting on Singapore Pools game 

Scenario: To verify the betting process on 4D/3D/2D Singapore Pools game 
	Given User is on Singapore Pools game 
	And User open fourD threeD twoD game and apply bet 
	Then User enter transaction page to check amount calculations 
    