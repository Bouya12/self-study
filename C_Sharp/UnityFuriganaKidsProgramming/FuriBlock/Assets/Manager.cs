using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Manager : MonoBehaviour {
    public GameObject PreBlock;
    void Start() {
        for (float x = -5; x <= 5; x+= 5) {
            for (float z = 2; z <= 8; z += 3) {
                Vector3 pos = new Vector3(x, 1, z);
                Instantiate(PreBlock, pos, Quaternion.identity);
            }
        }
    }
}
