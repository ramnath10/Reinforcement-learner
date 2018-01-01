package com.ram.rl.burlap;

public class MDPSolver {

/*	An int numStates. The states in the MDP are identified by an int from 0 to numStates-1, inclusive.
	An int numActions. The actions in the MDP are identified by an int from 0 to numActions-1, inclusive.
	A double[][][] probabilitiesOfTransitions. probabilitiesOfTransitions[i][j][k] is the probability of ending in state k by taking action j in state i. 
	For all i and j, summing probabilitiesOfTransitions[i][j][k] over the index k will equal 1.
	A double[][][] rewards. rewards[i][j][k] is the reward obtained by ending in state k by taking action j in state i.
*/
	public MDPSolver(int numStates, int numActions, double[][][] probabilitiesOfTransitions, double[][][] rewards) {
		
	}
	
	public double valueOfState(int state, double gamma) {
		
		return 0.0;
	}
}
