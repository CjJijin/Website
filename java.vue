const app = Vue.createApp({
    data() {
        return {
            recipes: [], // Array to store recipe data
            selectedRecipe: null, // Selected recipe
            mealPlan: [], // User's meal plan
            userProfile: {}, // User's profile data
        };
    },
    methods: {
        // Define methods for interactions
        selectRecipe(recipe) {
            this.selectedRecipe = recipe;
        },
        addToMealPlan(recipe) {
            this.mealPlan.push(recipe);
        },
    },
    computed: {
        // Define computed properties
        isRecipeSelected() {
            return this.selectedRecipe !== null;
        },
    },
});

// Register Vue components
app.component('recipe-list', {
    // Recipe list component
    template: `
        <div>
            <h2>Recipes</h2>
            <!-- Display list of recipes here -->
        </div>
    `,
});

app.component('recipe-details', {
    // Recipe details component
    template: `
        <div v-if="isRecipeSelected">
            <h2>Recipe Details</h2>
            <!-- Display selected recipe details here -->
        </div>
        <div v-else>
            <p>Select a recipe to view details.</p>
        </div>
    `,
});

app.component('meal-planner', {
    // Meal planner component
    template: `
        <div>
            <h2>Meal Planner</h2>
            <!-- Display meal planning features here -->
        </div>
    `,
});

app.component('user-profile', {
    // User profile component
    template: `
        <div>
            <h2>User Profile</h2>
            <!-- Display user profile and settings here -->
        </div>
    `,
});

// Mount the app
app.mount("#app");
